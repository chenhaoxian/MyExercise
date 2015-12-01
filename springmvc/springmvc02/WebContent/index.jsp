<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="user/list.do" method="post">
		<input type="submit" value="search">
	</form>
	
	<form action="user/add.do" method="post">
		<input type="submit" value="add">
	</form>
	
	<form action="user/update.do" method="post">
		<input type="submit" value="update">
	</form>
	
	
	<h1>use HttpServletRequest to pass the user information</h1>
	<form action="user/adduser" methon="post">
		account:<input type="text" name="account">
		password:<input type="text" name="password">
		<input type="submit" value="submit">
	</form>
	
	<h1>use param(String account ,String password) to pass user information</h1>
	<form action="user/adduserbyparam" methon="post">
		account:<input type="text" name="account">
		password:<input type="text" name="password">
		<input type="submit" value="submit">
	</form>
	
	<h1>use object to pass user information</h1>
	<form action="user/adduserbyobject" methon="post">
		account:<input type="text" name="account">
		password:<input type="text" name="password">
		<input type="submit" value="submit">
	</form>

</body>
</html>