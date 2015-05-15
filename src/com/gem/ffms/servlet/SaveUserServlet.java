package com.gem.ffms.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.User;
import com.gem.ffms.service.UserService;
/**
 * ���쾲
 * ��������ӵ��û���Ϣ
 * */
public class SaveUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
             this.doPost(request, response);
	}
	@SuppressWarnings("deprecation")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {     
	
             try{
            	 //������Ӧ�ķ������
            	 UserService ud = new UserService();
                 User user=new User();
                 //user.setU_id(Integer.parseInt(request.getParameter("u_id")));
                 //��ǰ̨��������
                 System.out.println(request.getParameter("u_username")+"------from jsp......");
                 user.setU_username(request.getParameter("u_username"));
                 user.setU_password(request.getParameter("u_password"));
                 String u_sex = request.getParameter("u_sex");
                 if("0".equals(u_sex)){
                	 user.setU_sex("Ů");
                 }else{
                	 user.setU_sex("��");
                 }
            	 user.setU_birthday(request.getParameter("u_birthday"));
            	 user.setU_createtime(request.getParameter("u_createtime"));
            	 user.setU_tel(request.getParameter("u_tel"));
                 user.setU_isdel(1);
                 user.setR_id(Integer.parseInt(request.getParameter("r_id")));
               //�ύ���ݵ����ݿ���
                 ud.saveUser(user);
               //����ҳ����ת
                 request.getRequestDispatcher("QueryUserServlet").forward(request, response);
             }catch(Exception e)
             {
            	 e.printStackTrace();
             }
             
		
	}

}
