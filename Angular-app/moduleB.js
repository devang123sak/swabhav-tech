

angular.module('moduleB', []).
    controller('controllerB', function ($scope, $rootScope) {

        console.log("Inside Controller B");
        $scope.controllerB = {
            message: "Controller B say Hello"
        };
        console.log($scope);
        console.log($rootScope);
    })


