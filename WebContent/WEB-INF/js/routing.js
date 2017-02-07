
var conumserApp=angular.module("consumerApp",['ngRoute'])
conumerApp.config(function ($routeProvider){
	$RouteProvider.when("/home",{
		templateUrl: "home.jsp",
		controller: "HomeCtrl"
	}).when("/admin/update",{
		templateUrl: "adminUpdate.jsp",
		controller: "AdminUpdateCtrl"
	}).when("/admin",{
		templateUrl: "myInfo.jsp",
		controller: "MyInfoCtrl"
	}).when("/consumers",{
		templateUrl: "consumers.jsp",
		controller: "ConsumerCtrl"
	})
});