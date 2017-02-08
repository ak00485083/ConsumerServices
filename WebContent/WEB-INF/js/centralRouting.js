
alert("hi there,in javascript");
var consumerApp=angular.module("consumerApp",['ngRoute'])
conumerApp.config(function ($routeProvider){
	$RouteProvider.when("/home",{
		templateUrl: "/views/home.jsp",
		controller: "consumerAppController"
	}).when("/admin/update",{
		templateUrl: "/views/adminUpdate.jsp",
		controller: "adminUpdateCtrl"
	}).when("/admin",{
		templateUrl: "/views/myInfo.jsp",
		controller: "myInfoCtrl"
	}).when("/consumers",{
		templateUrl: "/views/consumers.jsp",
		controller: "consumerCtrl"
	})
});


consumerApp.controller('consumerAppController', function($scope){
	alert("hi there,in javascript");
	$scope.message = 'Look! I am an about page.';
});
consumerApp.controller('adminUpdateCtrl', function($scope){
	$scope.message = 'Look! I am an about page.';
});
consumerApp.controller('myInfoCtrl', function($scope){
	$scope.message = 'Look! I am an about page.';
});
consumerApp.controller('consumerCtrl', function($scope){
	$scope.message = 'Look! I am an about page.';
});