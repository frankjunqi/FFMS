package com.gem.ffms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.OutputInfo;
import com.gem.ffms.service.WealthService;

public class GetOutputListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		WealthService ws = new WealthService();
		List<OutputInfo> list = ws.getoutputlist();
		System.out.println(list.size()+"     =====outputlistsize");
		
		request.setAttribute("list", list);
		
		
		request.getRequestDispatcher("managerfamwealth/listoutput.jsp").forward(request, response);
		
		
		
	}
	
	

}
