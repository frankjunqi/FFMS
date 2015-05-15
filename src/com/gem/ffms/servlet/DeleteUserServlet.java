package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.impl.UserDaoImpl;
/**
 * 赵庆静
 * 删除员工的一个servlet
 * */
public class DeleteUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
               this.doPost(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	   //从前台接受数据	
     String u_id=request.getParameter("u_id"); 
      //String u_username=request.getParameter("u_username");
     int u_idint=Integer.parseInt(u_id);
     //创建对应的服务对象
     UserDao ud=new UserDaoImpl();
     //提交数据到数据库里
     ud.deleteUser(u_idint);
    //进行页面跳转
     System.out.println("111111111111111s");
     request.getRequestDispatcher("QueryUserServlet").forward(request, response);
	
	}

}
