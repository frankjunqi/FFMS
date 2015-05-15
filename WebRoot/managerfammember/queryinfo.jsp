<%@ page language="java" import="java.util.*,com.gem.ffms.entity.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'queryinfo.jsp' starting page</title>
    
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
			width: 700px;
		}
	</style>
	
  </head>
  <body class="body1">
  <center><h1>查询所有成员</h1></center>
  
		<div class="box">
			<table class="datagrid" summary="Listado de cobros en MercadoPago">
				<caption></caption>
				<thead>
					<tr>
						<th scope="col"><input type="checkbox" name="mycheckall" ></th>
						<th scope="col">用户代码 : </th>
						<th scope="col">角色代码</th>
					    <th scope="col">用户名称</th>
						<th scope="col">联系电话</th>
						<th scope="col">性别</th>
						<th scope="col">出生日期</th>
						<th scope="col">创建日期</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				
				<c:forEach items="${list}" var="user">
					<tr>
						<td scope="row"><input type="checkbox" name="mycheck" value="${u_id}"></td>
						<td> <c:out value="${user.u_id}"/></td>
						<td><c:out value="${user.r_id}"/> </td>
						<td><c:out value="${user.u_username}"/> </td>
						<td><c:out value="${user.u_tel}"/> </td>
						<td><c:out value="${user.u_sex}" /> </td>
						<td><c:out value="${user.u_birthday}" /> </td>
						<td><c:out value="${user.u_createtime}"/> </td>
						<td><a href="DeleteUserServlet?u_id=${user.u_id}" >删除</a>|
	  	                <a href="managerfammember/updateinfo.jsp?u_id=${user.u_id}&r_id=${user.r_id} 
	  	                 &u_username=${user.u_username}&u_tel=${user.u_tel}&u_sex=${user.u_sex}
	  	                 &u_birthday=${user.u_birthday}">修改</a></td> 
					</tr>
					</c:forEach>
				</tbody>
			</table>
	</div>
	
  </body>
</html>
