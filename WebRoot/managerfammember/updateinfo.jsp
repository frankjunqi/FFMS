<%@ page language="java" import="java.util.*,com.gem.ffms.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatepeople.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/chico-0.10.2.css">

	<style> 
		/* Carousel list size */
		.YOUR_SELECTOR_Carousel .ch-carousel-content li {
			width:220px;
			height: 220px;
		}
		
		/* Icons demo */
		.showroomIcons li{
			clear:left;
		}
		
		.showroomIcons .ico {
			float:left;
			margin:2px 10px 0 0;
		}
		
		.autoComplete {
			width: 250px;
		}
		
		.autoComplete2 {
			width: 350px;
		}
		
		.autoComplete3 {
			width: 450px;
		}
	</style>
  </head>
  <body>
  
   <% 
  	User u = (User)request.getAttribute("user");
  %>
     <center><h1>更新用户信息</h1></center>
  <form action="UpdateUserServlet" method="post"><br>
    请修改用户<br>用户编号 ：<input type="text" name="u_id" value="<%=request.getParameter("u_id") %>" >
    <br>用户名称 ：<input type="text" name="u_username"  value="<%=request.getParameter("u_username") %>"><br>
    出生日期 ：<input type="text" name="u_birthday" value=<%=request.getParameter("u_birthday") %> ><br>&nbsp; &nbsp; 
密 &nbsp; 码 ：<input type="text" name="u_password"  value=<%=request.getParameter("u_password") %>><br>&nbsp;&nbsp;&nbsp; 
   电&nbsp; &nbsp; 话 ：<input type="text" name="u_tel"  value=<%=request.getParameter("u_tel") %>><br>&nbsp;&nbsp;&nbsp; 
性&nbsp; &nbsp; 别 ：<input type="text" name="u_sex"  value=<%=request.getParameter("u_sex") %>><br>
  创建日期 ：<input type="text" name="u_createtime"  value=<%=request.getParameter("u_createtime") %>><br>  
    角色编号 ：<input type="text" name="r_id"  value=<%=request.getParameter("r_id") %>><br>
  <input type="submit" value="确定"  >				
  </form>

  </body>
</html>
