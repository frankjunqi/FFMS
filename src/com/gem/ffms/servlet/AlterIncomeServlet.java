package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.service.WealthService;

public class AlterIncomeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
this.doPost(request, response);
}


public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
//��ǰ̨��������
String inctype = request.getParameter("incometype");
String innum = request.getParameter("innum");
String inctime = request.getParameter("inctime");
String id = request.getParameter("id");
System.out.println(inctype+" , "+ innum+" , "+ inctime);
//������Ӧ�ķ������
WealthService ws = new WealthService();
//�ύ���ݵ����ݿ������
ws.updateInCome(Double.parseDouble(innum), inctime, 1, 1,Integer.parseInt(id));
//����ҳ����ת
request.getRequestDispatcher("ListWealthServlet").forward(request, response);

}

}
