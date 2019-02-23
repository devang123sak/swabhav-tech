angular.module('swabhav-techLab')
    .factory('empService', ['$q', '$http', function ($q, $http) {
        var serviceObj = {};
        let empobjArray = [];

        serviceObj.getEmployees = function () {
            return $q(function (resolve, reject) {
                let empobjArray = [];
                $http({
                    method: "GET",
                    url: "http://localhost/Angular-app/emp.txt"
                }).then(function (response) {
                    if (response.status == 200) {
                        let strArray = response.data.split("\n");
                        for (let i = 0; i < strArray.length; i++) {
                            strArray[i] = strArray[i].replace(/\s+/g, "");
                            strArray[i] = strArray[i].replace(/'/g, "");
                        }
                        strArray = strArray.filter(function (value, index, self) {
                            return self.indexOf(value) === index;
                        });
                        for (let i = 0; i < strArray.length; i++) {
                            let row = strArray[i].split(",");
                            let obj = {
                                empId: row[0],
                                empName: row[1],
                                empRole: row[2],
                                empManagerID: row[3],
                                empJoiningDate: row[4],
                                empSalary: row[5],
                                empCommision: row[6],
                                empDepartName: row[7]
                            }
                            empobjArray.push(obj);
                        }
                        resolve(empobjArray);
                    } else {
                        reject("Data Can't be Fetched");
                    }
                });
            })
        }

        serviceObj.delete = function (value, array) {
            var deleteData = confirm("Do You Want To Delete Data");
            if (deleteData) {
                for (let i in array) {
                    if (array[i].empId == value) {
                        console.log(array[i]);
                        array.splice(i, 1);
                        console.log(array.length);
                    }
                }
            }
        }

        serviceObj.getdepartmentList = function (array) {
            let departmentList = [];
            for (let i in array) {
                departmentList.push(array[i].empDepartName);
            }
            departmentList = departmentList.filter(function (value, index, self) {
                return self.indexOf(value) === index;
            });
            console.log(departmentList);
            return departmentList;
        }

        serviceObj.getdesignationList = function (array) {
            let designationList = [];
            for (let i in array) {
                designationList.push(array[i].empRole);
            }
            designationList = designationList.filter(function (value, index, self) {
                return self.indexOf(value) === index;
            });
            console.log(designationList);
            return designationList;
        }

        serviceObj.getIdList = function (array) {
            let Idlist = [];
            for (let i in array) {
                Idlist.push(array[i].empId);
            }
            return Idlist;
        }

        serviceObj.addEmployee = function (obj, array) {
            array.push(obj);
        }

        return serviceObj;
    }])
    .controller('employeeController', ['$window', '$scope', 'empService', '$filter', function ($window, $scope, empService, $filter) {

        $scope.EmployeeArray;
        $scope.empIDList;
        $scope.departmentList;
        $scope.designationList;

        var promise = empService.getEmployees();
        promise.then(function (response) {
            $scope.EmployeeArray = response;
            $scope.departmentList = empService.getdepartmentList($scope.EmployeeArray);
            $scope.designationList = empService.getdesignationList($scope.EmployeeArray);
            $scope.empIDList = empService.getIdList($scope.EmployeeArray);

        }).catch(function (reject) {
            alert(reject);
        })

        $scope.showData = function () {
            $window.location.href = "#/display"
        };

        $scope.PassEvent = function (event) {
            empService.delete(event.target.value, $scope.EmployeeArray);
        };

        empService.getdepartmentList();

        $scope.Add = function (event) {
            var tempId = new Date().getUTCDate() * new Date().getUTCMilliseconds();
            var UniqueId = $filter('limitTo')(tempId, 4);
            var joiningDate = $filter('date')($scope.empJoiningDate, 'dd-MMM-yy');
            let obj = {
                empId: UniqueId,
                empName: $scope.empName,
                empRole: $scope.empRole,
                empManagerID: $scope.empManagerID,
                empJoiningDate: joiningDate,
                empSalary: $scope.empSalary,
                empCommision: $scope.empCommision,
                empDepartName: $scope.empDepartName
            }
            empService.addEmployee(obj, $scope.EmployeeArray);

        }


    }])