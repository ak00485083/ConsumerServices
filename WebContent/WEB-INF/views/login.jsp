<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div.login {
	height: 400px;
	float:right;
	width: 30%;
	background-color: powderblue;
	color: blue;
	border-style: ridge;
	border-color: white;
}
div.clear{
 clear:both;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login|SignUp</title>
</head>
<body>
<%@include file="header.jsp"%>
<form action="login" method="post" >
<div class="outer">
<div class="login">
<label>UserName</label>
<input type="text" id="username" name="username"><br>
<label>Password</label>
<input type="text" id="password" name="password"><br>
<input type="submit" value="Login"/>
</div>
<div class="clear"></div>
</div>
</form>

<%@include file="footer.jsp"%>
</body>

</html>