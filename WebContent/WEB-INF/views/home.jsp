<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  ng-app="consumerApp">
<head>
<style type="text/css">
div.side_menu{
background-color: powderblue;
float:left;
top: 90px;
 bottom: 80px;
}
table.side_menu_table{

}
div.clear{
 clear:both;
}
div.view{
float:right
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminApp</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-route.min.js"></script> -->
<script type="text/javascript" src="/CustomerServices/js/angular.js"></script>
<script type="text/javascript" src="/CustomerServices/js/angular-route.js"></script>
<script type="text/javascript" src="/CustomerServices/js/centralRouting.js"></script>
</head>
<body  >
<%@include file="header.jsp"%>
<div>
<div class=side_menu>

 <table class=side_menu_table>
				<tr>
					<td><a href="/CustomerServices/home">Home </td>
				</tr>
				<tr>
					<td><a href="/CustomerServices/consumers">Consumers</td>
				</tr>
				<tr>
					<td><a href="#/page2">Administrators</td>
				</tr>
				<tr>
					<td><a href="/CustomerServices/transactions">Transactions</td>
				</tr>
				<tr>
					<td><a href="/sendNotifications">Send Notifications</td>
				</tr>
			</table> 
</div>

<div class="ng-view">HII</div>

</div>
<div class="clear"></div>
<%@include file="footer.jsp"%>
</body>
</html>