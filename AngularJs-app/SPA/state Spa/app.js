
angular.module('swabhav-techLab', ['ui.router'])
    .config(function ($stateProvider, $urlRouterProvider) {
        $stateProvider.state('home', {
            url: "/home",
            templateUrl: "partials/home.html",
            controller: 'homeController',
        })
            .state('about', {
                url: "/about",
                templateUrl: "partials/about.html",
                controller: 'aboutController',
            })
            .state('carrer', {
                url: "/carrer",
                templateUrl: "partials/career.html",
                controller: 'carrerController',
            }) .state('contact', {
                url: "/contact",
                templateUrl: "partials/contact.html",
                controller: 'contactController',
            })
            .state('contact.list', {
                url: "/list",
                templateUrl: "partials/contact.list.html",
                controller: 'contactListController',
            }).state('contact.summary', {
                url: "/contact/summary",
                templateUrl: "partials/contact.summary.html",
                controller: 'contactController',
            })


        $urlRouterProvider.otherwise('/home');
    })

