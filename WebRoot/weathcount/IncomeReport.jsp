<%@ page language="java" import="java.util.*,com.gem.ffms.entity.*"
	pageEncoding="gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
<base href="<%=basePath%>">

<title>Income-Report</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


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
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/excel.js"></script>
</head>

<body>
		
		
		
		<center><h1>Income count</h1></center>

	<div class="box">
	<form action="countServlet" method="post">
		<ul id="tab1">
			<li><a
				href="wealthcount/IncomeReport.jsp"><b>Income-Report</b> </a></li>
		</ul>
		<div style="text-align: center; padding: 5px;">
	
			<input type="hidden" name="id" value="1"/>
			Income date: Year=<input type="text" style="width:60px" name="year" id="year" /> 
					   Month=<input type="text" name="month"style="width:60px" id="month" /> 
					   Day=<input type="text"name="day" style="width:60px" id="day" /> 
				<input type="submit" name="submit" value="Select"  />
				<input type="button" id="print" value="print" onclick="javascript:method1('mytable');">
			
		</div>
		</form>
			<table class="datagrid" summary="Listado de cobros en MercadoPago" id="mytable">
				<caption>Table</caption>
				<thead>
					<tr>
						
						<th scope="col">Day</th>
						<th scope="col">Month</th>
						<th scope="col" class="selected">year</th>
						<th scope="col">Total</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
			<c:forEach var="IncomeInfo" items="${requestScope.list}">	
					<tr>
						
						<td> ${IncomeInfo.i_day } </td>
						<td>${IncomeInfo.i_month } </td>
						<td>${IncomeInfo.i_year } </td>
						<td>${IncomeInfo.i_num }</td>
						
					</tr>
					</c:forEach>
					<tr>Total number:
					<%= request.getAttribute("totalNum") %></tr>
				</tbody>
			</table>
	</div>
		
		
		
		
		
		
		
		
		

				
</body>
</html>

