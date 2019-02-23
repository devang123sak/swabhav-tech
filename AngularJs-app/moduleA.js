angular.module('moduleA', ['moduleB', 'moduleC']).
    controller('controllerA', function ($scope, $rootScope) {

        console.log("Inside Controller A");
        $scope.controllerA = {
            message: "Controller A say Hello"
        };
        console.log($scope);
        console.log($rootScope);
    })    