package com.gem.ffms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.MemorialDao;
import com.gem.ffms.entity.RemindInFo;
import com.gem.ffms.impl.MemorialImpl;
/**
 * ��ȡ����¼��Servlet
 * @author Administrator
 *
 */
public class getComListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemorialDao md = new MemorialImpl();
		List<RemindInFo> rl = md.getRemList();
		request.setAttribute("rl", rl);
		request.getRequestDispatcher("other/listremind.jsp").forward(request, response);
		
		
	}

}
