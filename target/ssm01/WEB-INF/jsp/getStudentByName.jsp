<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>查询</title>  
  </head>  
    <h1>根据名字查询学生的信息</h1>
  <body style="text-align:center">  
  <div >
  <form action="/ssm02/student/getStudentByName">
     学生姓名:<br>
    <input type="text" name="name">
     <br><br>
    <button type="submit">查询</button><br>
  学生信息：<br>
  <table border=1 width="400" align="center" style="text-align:center">
		<tr>
			<th>id</th>
			<th >姓名</th>
			<th >年龄</th>
            <th >性别</th>
            <th >语文</th>
            <th >数学</th>
            <th >英语</th>
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
		</tr>
		</c:forEach>
	</table> 
    <a href="getAllStu">返回学生信息页面</a>
    &nbsp;&nbsp;<a href="/ssm02/user/index">返回登录页面</a>
  </form>
</div>
  </body>  
</html> 