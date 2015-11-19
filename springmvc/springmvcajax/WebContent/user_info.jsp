<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
	alert('ok111');
	$().ready(function(){
		$("#btn_checkUser").click(function(){
			alert('ok');
			var username = $("#username").val();
			if(username.length == 0){
				alert('please input your username.');
			}else{
				$.post("ajaxCheckUser.do",{username:username},function(data){
					alert(data);
				});
			}
			
		});
	});
</script>

</head>
<body>
<hr>
username:<input type="text" id="username" name="username">
<input type="button" id="btn_checkUser" value="check">
<hr>
</body>
</html>