<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/ssm02/user/updateUserPwd">

    <h2>大哥，请不要修改Name</h2>
	<!-- id:<input type= "text" name="id" ><br> -->
	 姓名：<input type="text" name="name" ><br>
	 密码：<input type="password" name="pwd" ><br>
	 确认 密码：<input type="password" name="pwd1" ><br>
<input type = "submit" value = "修改"></form>
</body>
</html>