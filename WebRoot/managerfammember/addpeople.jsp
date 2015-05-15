<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addpeople.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/Calendar3.js"> </script>
	<link rel="stylesheet" type="text/css" href="css/chico-0.10.2.css">
	<script type="text/javascript" src="js/addpeople.js"></script>
	<script type="text/javascript">
 /*
 $(function(){
	 	$("#r_id").blur(function(){
	 		if($("#r_id").val() == null){
	 			alert("不能为空");
	 			return false;
	 		}
	 		
	 	});
	 
 });
 */
 	function checkname(){
	var name = document.getElementById("r_id").value(); 
	alert(name);
	return false;
	 
  }
 </script>
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
  
  <body><br>
  <center><h1>添加用户</h1></center>
  <form action="SaveUserServlet" name="bbsforum" id="bbsforum" method="post">&nbsp; &nbsp; 用户名：<input type="text" name="u_username"  ><br>&nbsp;
  角色编号：<input type="text" name="r_id" id="r_id"><br>&nbsp;&nbsp;&nbsp; 
  密&nbsp;&nbsp; 码：<input type="password" name="u_password"  id="password"><br>&nbsp; &nbsp; 
  性&nbsp;&nbsp; 别：男<input type="radio" checked="checked" name="sex"  value="1"  /> 女<input type="radio" name="sex" value="0"><br>&nbsp;
  出生时间：<input type="text" name="u_birthday" onclick="new Calendar().show(this);" id="birthday"><br>&nbsp; &nbsp; 
  电 &nbsp; 话：<input type="text" name="u_tel"  id="tel"><br>

			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" onclick="checkname()" value="添加"  >
			&nbsp;&nbsp;<input type="reset" value="重置" >
   </form>
  </body>
</html>
