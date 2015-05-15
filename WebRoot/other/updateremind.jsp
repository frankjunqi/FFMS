<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateremind.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <center><h1>修改备忘录</h1></center>

    	<div align="right"><form action="UpdateRemindServlet" method="post"> 
    		<input type="hidden" name="rem_id" value="<%=  request.getParameter("rem_id")%>"> 
    		提醒时间：<input type="text" name="remindtime" size="30" value="<%=  request.getParameter("rtime")%>"><br> 
    		提醒内容: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br> 
    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="30" name="remindcontent"></textarea><br> 
    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"> 
    	</form></div>
  </body>
</html>
