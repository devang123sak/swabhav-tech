angular.module("swabhav-techLab").controller("homeController", function ($scope) {
    console.log("this is Home Controller");
    $scope.data = "this is Home Controller";

}).controller("aboutController", function ($scope) {
    console.log("this is about Controller");
    $scope.data = "this is about Controller";

}).controller("carrerController", function ($scope) {
    console.log("this is career Controller");
    $scope.data = "this is career Controller";
})