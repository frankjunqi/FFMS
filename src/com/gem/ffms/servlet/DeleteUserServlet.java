package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.impl.UserDaoImpl;
/**
 * ���쾲
 * ɾ��Ա����һ��servlet
 * */
public class DeleteUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
               this.doPost(request, response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	   //��ǰ̨��������	
     String u_id=request.getParameter("u_id"); 
      //String u_username=request.getParameter("u_username");
     int u_idint=Integer.parseInt(u_id);
     //������Ӧ�ķ������
     UserDao ud=new UserDaoImpl();
     //�ύ���ݵ����ݿ���
     ud.deleteUser(u_idint);
    //����ҳ����ת
     System.out.println("111111111111111s");
     request.getRequestDispatcher("QueryUserServlet").forward(request, response);
	
	}

}
