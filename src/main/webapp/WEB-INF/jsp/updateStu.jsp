<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/ssm02/student/updateStu">

    <h1>大哥，请不要修改ID</h1>
	id:   <input readonly type="text" name="id" value=${student.id}><br>
	姓名：<input type="text" name="name" value=${student.name}><br>
	年龄：<input type="text" name="age" value=${student.age}><br>
	性别：<input type="text" name="sex" value=${student.sex}><br>
	语文：<input type="text" name="chinese" value=${student.chinese}><br>
	数学：<input type="text" name="math" value=${student.math}><br>
	英语：<input type="text" name="english" value=${student.english}><br>
<input type = "submit" value = "修改"></form>
</body>
</html>