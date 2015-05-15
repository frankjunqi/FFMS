<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <script type="text/javascript" src="../js/Calendar3.js"> </script>
  </head>
  
  <body  >
                 <div style="background: #FFF url('assets/gradients.png') 0 -280px repeat-x;
			border: 2px solid #CCC;">       
                     添加收入/支出: <br>
                     
                    <!-- 这里的表单必须歇山 action 。。。。。actio里的内容是提交到对应的Servlet然后进行处理 
    						input框里的name属性一定要和对应的Servlet里的Getparameter方法里的参数对应一致。。。                	
	                     -->
	                     <center>
                    <form action="../AddIncomeServlet" method="post">
							         存款类型: 
                            <select name="incometype" onchange="favBrowser()">
                            <option value="1">医药</option>
                            <option value="3">食品</option>
                            <option value="2">交通</option>
                            <option value="5">保险</option>
                            <option value="4">投资</option>
                            </select><br>
								存款金额:
							<input name="innum" type="text">元<br>
								存款日期:
							<input name="inctime" type="text" onclick="new Calendar().show(this);"  ><br>
					        <input  type="submit" value="添加" >
					        <input type="reset" value="重置" >
					</form>
					</center>
					</div>
  </body>
</html>

					
				
            
					
					

						    
					
