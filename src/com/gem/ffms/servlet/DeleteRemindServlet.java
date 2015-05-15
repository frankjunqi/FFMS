package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.MemorialDao;
import com.gem.ffms.impl.MemorialImpl;

public class DeleteRemindServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("rem_id");
		System.out.println("rem_id = "+ id);
		MemorialDao md = new MemorialImpl();
		
		md.delteRemindFo(Integer.parseInt(id));
		
		request.getRequestDispatcher("getComListServlet").forward(request, response);
		
		
	}
}
