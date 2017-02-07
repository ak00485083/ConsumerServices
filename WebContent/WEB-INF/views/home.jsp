<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="bootstrap/javascript/angular.js"></script>
<script src="bootstrap/javascript/angular-route.js"></script>
<style type="text/css">
div.side_menu{
}
table.side_menu_table{

}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminApp</title>
</head>
<body>
<%@include file="header.jsp"%>

<div ng-app="consumerApp" ng-controller="ConsumerAppController">
<div class=side_menu>
<table class=side_menu_table>
<tr><a href="/home">Home</tr>
<tr><a href="/consumers">Consumers</tr>
<tr><a href="/administrators">Administrators</tr>
<tr><a href="/transactions">Transactions</tr>
<tr><a href="/sendNotifications">Send Notifications</tr>
</table>
</div>
<div ng-view></div>
</div>
<h3>welcome home!!!!</h3>
<%@include file="footer.jsp"%>
</body>
</html>