<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录与注册</title>
</head>
<body>
<h1>user login and register</h1>
<form action="/loginAndRegister/userLogin.do" method="post"> 
	username:<input type="text" name="username">
	password:<input type="password" name="password">
	<input type="submit" value="submit"><input type="reset" value="reset">
</form>
<h1>want to join us? please click bellow </h1>
<button value="register" onclick="/loginAndRegister/userRegister.do"></button>

</body>
</html>