<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showcount.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/swfobject.js"></script>
		<script type="text/javascript">

			swfobject.embedSWF(
				"open-flash-chart.swf", "my_chart",
				"550", "400", "9.0.0", "expressInstall.swf",
				{"data-file":"GetCountDataServlet?year1=<%= request.getParameter("year1")%> &year2= <%= request.getParameter("year2")%>"} );
		</script>
  </head>
  
  <body>
  <%= request.getParameter("year2")%>
  mychar<br>
  <div id="my_chart"></div>
  </body>
</html>
