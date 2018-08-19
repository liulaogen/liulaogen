<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>查询</title>  
  </head>  
    
  <body>  
  <div >
  <form action="/ssm02/user/getUserByName">
     用户姓名:<br>
    <input type="text" name="name">
     <br><br>
    <button type="submit">查询</button><br>
    <%-- 用户信息：<br>
  <table border=2>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>pwd</th>
			
		</tr>
		<c:forEach var="item" items="${xxx}" >
			<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.pwd }</td>
		</tr>
		</c:forEach>
	</table>  --%>
    <a href="getAllStu">返回学生信息页面</a>
    &nbsp;&nbsp;<a href="/ssm02/user/index">返回登录页面</a>
  </form>
</div>
  </body>  
</html> 