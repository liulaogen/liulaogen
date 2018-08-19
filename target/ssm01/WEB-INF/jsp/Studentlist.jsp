<%@ page language="java" import ="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="zizai.controller.StudentController"%>
<%@ page import="zizai.model.Student"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息列表</title>
</head>

<h2>学生信息列表信息</h2>
<body style="text-align:center">


<table border=1 width="400" align="center" style="text-align:center">
		<tr>
			<th>id</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别 </th>
			<th>语文</th>
			<th>数学</th>
			<th>英语</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach var="item" items="${xxx}" >
			<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.age }</td>
			<td>${item.sex }</td>
			<td>${item.chinese}</td>
			<td>${item.math}</td>
			<td>${item.english}</td>
		<td>
			<form action = "/ssm02/student/selectStudentByID"><input type="hidden" name="id" value=${item.id}>
				<input type = "submit" value = "修改">
			</form>
		</td>
		<td>
			<form action = "/ssm02/student/delStu"><input type="hidden" name="id" value=${item.id}>
			<input type = "submit" value = "删除"></form></td>
		</tr>
		</c:forEach>
</table>
	<a href="/ssm02/student/toAddPage">添加</a>
	
	<a href="/ssm02/student/getStudentByName">查询</a><br>	
	<a href="/ssm02/user/index">返回登录页面</a>

		
		<!--  </form> -->	
</body>
</html>