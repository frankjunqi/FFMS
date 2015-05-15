package com.gem.ffms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.entity.User;
import com.gem.ffms.impl.UserDaoImpl;

public class loginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username +" , "+ password);
		
//		StudentDao studao = new StudentDaoImpl();
//		Student stu = studao.queryStudntByName(username);
		UserDao userDao = new UserDaoImpl();
		User u  = userDao.getUserByName(username);
		System.out.println(u.getU_id()+"   ========================");
		
		HttpSession session =  request.getSession();
			if(u.getU_username() != null){
				if(u.getU_password().equals(password)){
					
					session.setAttribute("user", u);
					request.getRequestDispatcher("loginsuccess.jsp").forward(request,response);
				}else{
					response.sendRedirect("Loginon.jsp");
				}
			}else{
				response.sendRedirect("Loginon.jsp");
			}
	
		
	
	}

}
