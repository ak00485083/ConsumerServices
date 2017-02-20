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

consumerApp.controller('mainController', function($scope,$http,$rootScope){
	$scope.admin=$rootScope.loggedInUser;
	$scope.success=false;
	$scope.create=true;
	$scope.message = 'Look! I am on admin details page.';
	$scope.saveAdminDetails=function(){
		$http({
			method:'PUT',
			url:'admins/'+ $scope.admin.username,
			data : $scope.admin
		}).then(function successCalback(response){
			$scope.admin=response.data;
		},function errorCallback(response){
			console.log(response.statusText);
		});
		
	};
	$scope.createAdmin=function(createForm){
		$scope.admin=createForm;
		$http({
			method:'POST',
			url:'admins/',
			data : $scope.admin
		}).then(function successCalback(response){
			$scope.success=true;
			$scope.create=false;
			$scope.password=response.data;
		},function errorCallback(response){
			$scope.create=true;
			console.log(response.statusText);
		});
		
	};
	$scope.deleteAdmin=function(){
		
		$http({
			method:'DELETE',
			url:'admins/',
			data : $scope.admin.username
		}).then(function successCalback(response){
			$scope.admin=response.data;
		},function errorCallback(response){
			console.log(response.statusText);
		});
		
	};
	$scope.search=function(searchForm){
		$scope.admin=searchForm;
		$http({
			method:'GET',
			url:'admins/'
//			data : $scope.admin
		}).then(function successCalback(response){
			$scope.success=true;
			$scope.adminList=response.data;
		},function errorCallback(response){
			console.log(response.statusText);
		});
		
	};
	
	$scope.cancelOperation=function(){
	};
	
//	
	
	
	
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