angular.module("swabhav-techLab")
    .constant('STUDENT_URL',
        { url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' })
    .directive('header', function () {
        return {
            templateUrl: 'Directive/header.html',
        }
    }).directive('footer', function () {
        return {
            templateUrl: 'Directive/footer.html',
        }
    })
    .factory("studentServices", ["$log", "$q", "$http", "$window", "STUDENT_URL", function ($log, $q, $http, $window, STUDENT_URL) {
        console.log("inside service");
        var studentObj = {};

        studentObj.reloadPage = function () { $window.location.reload(); }

        studentObj.getStudentList = function () {
            return $q(function (resolve, reject) {
                $http.get(STUDENT_URL.url).then(function (response) {
                    if (response.status == 200) {
                        console.log(response.data);
                        resolve(response.data);
                    } else {
                        reject("errroe obtained");
                    }
                }).catch(function () {
                    alert("error in get method");
                });
            })
        }

        studentObj.postStudentList = function (student) {
            return $q(function (resolve, reject) {
                $http.post(STUDENT_URL.url, student)
                    .then(function (response) {
                        console.log("excute post method");
                        $window.location.href = '#/display';
                        studentObj.reloadPage();

                    }).catch(function () {
                        console.log("error ");
                    })
            })
        }

        studentObj.getselectedStudent = function (studentId) {
            return $q(function (resolve, reject) {
                $http.get(STUDENT_URL.url + studentId).then(function (response) {
                    console.log(response.data[0]);
                    resolve(response.data[0]);
                }).catch(function () {
                    alert("error in select method");
                });
            })
        }

        studentObj.deleteStudentData = function (studentId) {
            return $q(function (resolve, reject) {
                $http.delete(STUDENT_URL.url + studentId)
                console.log("delete data Suceessfully");
                studentObj.reloadPage();
            }).then(function (response) {
                console.log("delete data Suceessfully");
            }).catch(function (reject) {
                console.log("error while deleting data");
            });
        }

        studentObj.updateStudentData = function (studentId, inputName, inputRollNumber, inputAge, inputEmail, inputDate, gender) {
            $http({
                url: STUDENT_URL.url + studentId,
                method: 'PUT',
                data: {
                    "rollNo": inputRollNumber,
                    "name": inputName,
                    "age": inputAge,
                    "email": inputEmail,
                    "date": inputDate,
                    "isMale": gender,
                },
                success: function () {
                }
            });
            studentObj.reloadPage();
            $window.location.href = '#/display';
        }

        return studentObj;
    }]).factory("loginServices", ["$window", function ($window) {
        console.log("inside login service");
        var loginObj = {};
        loginObj.setLoggingStatus == false;
        loginObj.reloadPage = function () { $window.location.reload(); }

        loginObj.loginPage = function (inputUserId, inputPassword) {
            if (inputUserId == inputPassword) {
                console.log("excute logging page");
                var status = {
                    userName: inputUserId,
                    logged: true
                };
                $window.sessionStorage.setItem("loggingStatus", JSON.stringify(status));
                $window.location.href = '#/display';

            } else {
                alert("InCorrect User ID or Password");
            }
        }
        return loginObj;
    }])

    .controller("displayController", ["$scope", "studentServices", "$rootScope", function ($scope, services, $rootScope) {

        if (sessionStorage.getItem("loggingStatus") == null) {
            $scope.isDisabled = true;
            $scope.status = "INACTIVE";
            $scope.logoutHideStatus = true;
            $scope.welcomeLabel = true;
        }

        if (!(sessionStorage.getItem("loggingStatus") == null)) {
            var labelName = JSON.parse(sessionStorage.getItem("loggingStatus"));
            $rootScope.userName = labelName.userName;
        }

        services.getStudentList().then((empList) => {
            console.log("excute resolve");
            $scope.studentdata = empList;
            $scope.count = $scope.studentdata.length;
        }).catch((e) => {
            console.log("error occured in display Controller" + e);
        })

    }]).controller("addStudentController", ["$scope", "studentServices", function ($scope, services) {
        $scope.addStudentData = function () {
            var studentObject = {
                name: $scope.inputName,
                rollNo: $scope.inputRollNumber,
                age: $scope.inputAge,
                email: $scope.inputEmail,
                date: $scope.inputDate,
                isMale: $scope.result,
            }
            services.postStudentList(studentObject).then(function () {
                console.log("excute location change");
            }).catch(function () {
                console.log("not access");
            });
        }

    }]).controller("editController", ["$scope", "studentServices", "$routeParams", "$window", function ($scope, studentServices, $routeParams, $window) {
        // console.log($routeParams.UID);
        console.log(sessionStorage.getItem("loggingStatus"));
        if (!(sessionStorage.getItem("loggingStatus") == null)) {
            console.log("edit controller working");
            studentServices.getselectedStudent($routeParams.UID).then((studentObj) => {
                $scope.inputName = studentObj.name;
                $scope.inputRollNumber = studentObj.rollNo;
                $scope.inputAge = studentObj.age;
                $scope.inputEmail = studentObj.email;
                $scope.inputDate = new Date(studentObj.date);
                if (studentObj.isMale == true) {
                    $scope.result = 1;
                } else {
                    $scope.result = 2;
                }
            }).catch(function () {
                console.log("error");
            });

            $scope.updateData = function () {
                studentServices.updateStudentData($routeParams.UID, $scope.inputName, $scope.inputRollNumber, $scope.inputAge, $scope.inputEmail, $scope.inputDate, $scope.result);
            }
        } else {
            $window.location.href = '#/loginPage';
        }

    }]).controller("deleteController", ["$scope", "studentServices", function ($scope, studentServices) {
        //console.log("inside delete Controller");
        $scope.deleteData = function (event) {
            console.log(event.target.id);
            if (confirm("CONFIRM")) {
                studentServices.deleteStudentData(event.target.id);
                alert("Data is Deleted");
            }
        }

    }]).controller("loginPageController", ["$scope", "loginServices", "$rootScope", function ($scope, loginServices, $rootScope) {

        $scope.login = function () {
            $scope.isDisabled = false;
            $scope.status = "ACTIVE";
            $scope.logoutHideStatus = false;
            $scope.welcomeLabel = false;

            var inputUserId = $scope.inputUserId;
            var inputPassword = $scope.inputPassword;
            loginServices.loginPage(inputUserId, inputPassword);
            $rootScope.userName = $scope.inputUserId;
        }

        $scope.logout = function () {
            $scope.isDisabled = true;
            $scope.status = "INACTIVE";
            $scope.logoutHideStatus = true;
            $scope.welcomeLabel = true;
            sessionStorage.removeItem("loggingStatus");
            loginServices.reloadPage();
        }
    }]);
