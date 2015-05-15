package com.gem.ffms.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.entity.User;
import com.gem.ffms.impl.UserDaoImpl;

public class QueryByIdServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        //�����������
		//��ǰ̨��������
		String u_id=request.getParameter("u_id");
		int u_idint=Integer.parseInt(u_id);
		System.out.println(u_id);
		UserDao ud=new UserDaoImpl();
		User user=ud.queryStuById(u_idint);
		if(user!=null)
		{
			System.out.println("��ֵ");
		//�ύ���ݵ����ݿ���
			request.setAttribute("user",user);
			System.out.println(user.getR_id()+user.getU_birthday());
			
		//����ҳ����ת
			request.getRequestDispatcher("managerfammember/updateinfo.jsp").forward(request, response);
		}
		
	}

}
