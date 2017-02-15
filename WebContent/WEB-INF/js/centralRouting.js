var consumerApp=angular.module("consumerApp",['ngRoute']);

consumerApp.config(function ($routeProvider){
//	 $locationProvider.html5Mode(true);
	
//	$routeProvider.when("/page2",{
//		templateUrl: "views/adminUpdate2.html",
//		controller: "adminUpdateCtrl"
//	});
	
	$routeProvider.when("/home",{
		templateUrl: "html/adminNavigator.html",
		controller: "mainController"
	}).when("/admin",{
		templateUrl: "html/adminUpdate.html",
		controller: "adminUpdateCtrl"
	}).when("/consumers",{
		templateUrl: "html/consumers.html",
		controller: "consumerCtrl"
	}).when("/transactions",{
		templateUrl: "html/transactions.html",
		controller: "transactionsCtrl"
	})
});

consumerApp.controller('mainController', function($scope,$http){
	$scope.message = 'Look! I am on admin details page.';
	 $scope.count = 0;
	$scope.saveAdminDetails=function(){
		$scope.count++;
	};
	$scope.cancel=function(){
		$scope.count++;
	};
	
//	$http({
//		method:'GET',
//		url:'admin/'+ $scope.form.id,
//	}).then(function successCalback(response){
//		$scope.admin=response.data.admin;
//	},function errorCallback(response){
//		console.log(response.statusText);
//	});
	
	
	
});
consumerApp.controller('adminUpdateCtrl', function($scope){
	$scope.message = 'Look! I am an admin update page.';
});
consumerApp.controller('transactionsCtrl', function($scope){
	$scope.message = 'Look! I am an admin info page.';
});
consumerApp.controller('consumerCtrl', function($scope){
	$scope.message = 'Look! I am consumer page.';
});