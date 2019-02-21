angular.module('swabhav-techLab', ['ui.router'])
    .config(
        function ($stateProvider,$urlRouterProvider) {
            $stateProvider.state('form', {
                url:'/form',
                templateUrl: 'html/form.html',
                controller: 'employeeController'
            }).state('display', {
                url:'/display',
                templateUrl: 'html/display.html',
                controller: 'employeeController'
            })
            $urlRouterProvider.otherwise('/form');
            console.log("config created")
        }
    )