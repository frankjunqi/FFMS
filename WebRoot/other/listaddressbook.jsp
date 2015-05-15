<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>通讯录</title>
    
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
  

	<center><h1>通讯录</h1></center><div align="right"><a href="other/addcommucation.jsp">添加通讯录</a></div>
    	
	
	
	<div class="box">
			<table class="datagrid" summary="Listado de cobros en MercadoPago">
				<caption>Table</caption>
				<thead>
					<tr>
						<th scope="col"><input type="checkbox" name="mycheckall" ></th>
						<th scope="col">编号 : </th>
						<th scope="col">姓名</th>
						<th scope="col" class="selected">地址<span class="asc">(asc)</span></th>
						<th scope="col">电话</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${requestScope.addlist}" var="Address">
					<tr>
						<td scope="row"><input type="checkbox" name="mycheck" value="${Address.ab_id}"></td>
						<td> <c:out value="${Address.ab_id}"/></td>
						<td><c:out value="${Address.ab_name}"/> </td>
						<td><c:out value="${Address.ab_address}" /> </td>
						<td><c:out value="${Address.ab_tel}" /> </td>
						<td><a href="DeleteMessageServlet?method=delete&id=${Address.ab_id}" >删除</a>|
	  	  <a href="other/updateMessage.jsp?ab_id=${Address.ab_id}&name=${Address.ab_name}&address=${Address.ab_address}&tel=${Address.ab_tel}">修改</a></td>
						
					</tr>
					</c:forEach>
				</tbody>
			</table>
	</div>
	
	
  </body>
</html>
