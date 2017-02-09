var consumerApp=angular.module("consumerApp",['ngRoute']);

consumerApp.config(function ($routeProvider){
//	 $locationProvider.html5Mode(true);
	
	$routeProvider.when("/page2",{
		templateUrl: "views/adminUpdate2.html",
		controller: "adminUpdateCtrl"
	});
});

consumerApp.controller('mainController', function($scope){
	$scope.message = 'Look! I am an about page.';
});
consumerApp.controller('adminUpdateCtrl', function($scope){
	$scope.message = 'Look! I am an admin page.';
});
consumerApp.controller('myInfoCtrl', function($scope){
	alert("hi there,in admin infor");
	$scope.message = 'Look! I am an about page.';
});
consumerApp.controller('consumerCtrl', function($scope){
	alert("hi there,in consumer update");
	$scope.message = 'Look! I am an about page.';
});