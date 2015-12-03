<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hahahahahaha  you are success!</h1>
	all users :<br>
	<table>
		<c:if test="${empty usersList }">
			<c:forEach items="${usersList }" var="users">
				<tr>
					<td>${users.username }</td>
					<td>${users.password }</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>