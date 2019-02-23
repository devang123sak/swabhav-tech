angular.module("swabhav-techLab", ["ngRoute"]).config(function ($routeProvider) {
    $routeProvider.when("/", {
      //  templateUrl: 'partials/home.html',
       // controller: 'homeController',
    }).when("/home", {
        templateUrl: 'partials/home.html',
        controller: 'homeController',
    }).when("/about", {
        templateUrl: 'partials/about.html',
        controller: 'aboutController',
    }).when("/career", {
        templateUrl: 'partials/career.html',
        controller: 'carrerController',
    })
})