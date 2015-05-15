<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	修改存钱记录  
  </head>
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
  
  <body> 
  <div class="box" >
  <center>
   		 修改收入/支出:<br>
               <form action="../AlterIncomeServlet" method="post">      
               <%=request.getParameter("id") %> <br>
				<input type="hidden" name = "id" value="<%=request.getParameter("id") %>"/>
								修改类型:
							<select name="incometype" onchange="favBrowser()">
                            <option value="1">医药</option>
                            <option value="3">食品</option>
                            <option value="2">交通</option>
                            <option value="5">保险</option>
                            <option value="4">投资</option>
                            </select><br>
								修改金额:
							<input name="innum" type="text" >元<br>
								修改日期:
							<input name="inctime" type="text" ><br>
					        <input  type="submit" value="修改" >
					        <input  type="reset" value="重置" >
					</form>
					</center>
					</div>
  </body>
</html>
				 
        
			
						
					
