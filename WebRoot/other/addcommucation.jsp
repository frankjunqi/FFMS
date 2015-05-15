<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addcommucation.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  	
  <body>

   <center><h1>添加通讯录</h1></center>
   <form action="AddMessageServlet" method="post">
   <input type="hidden"  name="u_id" value= "${sessionScope.user.u_id }"/>
   <center>
   <table width="60%" border="0">
  <tr>
    <td >姓名</td>
    <td ><input type="text" name="ab_name"/></td>
  </tr>
  <tr>
    <td>地址：</td>
    <td><input type="text" name="ab_address"/></td>
  </tr>
  <tr>
    <td>电话</td>
    <td><input type="text" name="ab_tel"/></td>
  </tr>
  <tr>
    <td><input type="submit" value="提交"/></td>
   
  </tr>
</table>

   </center>
   
   	</form>
  </body>
</html>
