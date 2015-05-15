<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'savesuccess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
   <body onload="loadPage();">
		<script>
		var timeId;
		function loadPage(){
			timerId = setInterval('countDown()',1000);
		}
			var sec = 3;

			function countDown() {
				if (sec > 0) {
				document.getElementById("num").innerHTML = sec--;
			} else {
				clearInterval(timerId);
				window.location.href = "ListWealthServlet";
		}
	}
		</script>
		3秒后将跳转到列表帐页面~~<br>
    	<font id = "num" size="6" color='red'>3</font> <br>
  </body>
</html>
