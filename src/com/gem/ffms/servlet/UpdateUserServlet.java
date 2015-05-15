package com.gem.ffms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.entity.User;
import com.gem.ffms.impl.UserDaoImpl;
/**
 *���쾲
 * 
 * ���¼�ͥ��Ա��Ϣ��servlet
 * */
public class UpdateUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	@SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 // //������Ӧ�ķ������
		UserDao ud=new UserDaoImpl();
        User user=new User();
      //��ǰ̨��������
        user.setU_id(Integer.parseInt(request.getParameter("u_id").trim()));
        user.setU_username(new String (request.getParameter("u_username").getBytes("ISO-8859-1"),"UTF-8"));
        user.setU_password(request.getParameter("u_password").trim());
        user.setU_sex(new String(request.getParameter("u_sex").getBytes("ISO-8859-1"),"UTF-8"));
        user.setU_birthday(request.getParameter("u_birthday").trim());
       	user.setU_createtime(request.getParameter("u_createtime").trim());
        user.setU_tel(request.getParameter("u_tel").trim());
        user.setU_isdel(1);
        user.setR_id(Integer.parseInt(request.getParameter("r_id")));
      //�ύ���ݵ����ݿ���
        ud.updateUser(user);
      //����ҳ����ת
        request.getRequestDispatcher("QueryUserServlet").forward(request, response);
        
	}

}
