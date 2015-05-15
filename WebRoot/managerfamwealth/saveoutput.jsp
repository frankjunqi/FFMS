<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'saveoutput.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/chico-0.10.2.css">
	<script type="text/javascript" src="js/Calendar3.js"> </script>
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
   	 <div style="background: #FFF url('assets/gradients.png') 0 -280px repeat-x;
			border: 2px solid #CCC;">
 
  <center>
 	 <form action="SaveOutputInfoServelt" method="post">
  		<input type="hidden" name="u_id" value=" ${sessionScope.user.u_id}" />
   	存钱数额:  <input name="num" type="text" ><br>
          存钱日期:  <input type="text" name="time"  onclick="new Calendar().show(this);" /><br>
    <input type="submit" value="提交"/>
  	
  </form>
  </center>
  </div>
  </body>
</html>
