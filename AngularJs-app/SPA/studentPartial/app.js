angular.module("swabhav-techLab", ["ngRoute"]).config(function ($routeProvider) {
    $routeProvider.when("/", {
        templateUrl: 'studentForm.html',
        controller: 'addStudentController',
    }).when("/display", {
        templateUrl: 'display.html',
        controller: 'displayController',
    }).when("/studentForm", {
        templateUrl: 'studentForm.html',
        controller: 'addStudentController',
    }).when("/loginPage", {
        templateUrl: 'loginPage.html',
        controller: 'loginPageController',
    }).when("/edit/:UID", {
        templateUrl: 'edit.html',
        controller: 'editController',
    })
})