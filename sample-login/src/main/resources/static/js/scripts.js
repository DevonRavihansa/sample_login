var app = angular.module("app", []);

app.controller("ctrl", function($scope){
    $scope.message = "Hello, Welcome Spring";
});

app.controller("login", function($scope){
    $scope.message = "Login";
});