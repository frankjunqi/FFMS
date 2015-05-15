<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'getcountyear.jsp' starting page</title>

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
	<div
		style="background: #FFF url('assets/gradients.png') 0 -280px repeat-x;
			border: 2px solid #CCC;">
		<center>
			<form action="weathcount/showchar.jsp" method="post">
				The year you need to count:<input type="text" name="year1" /><br>
				The year you need to count:<input type="text" name="year2" /><br>
				<input type="submit" value="submit" />
			</form>
		</center>
	</div>
</body>
</html>
