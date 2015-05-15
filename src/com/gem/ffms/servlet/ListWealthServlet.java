package com.gem.ffms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.service.WealthService;

public class ListWealthServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		WealthService ws = new WealthService();
		List<IncomeInfo> list = ws.getIncomeList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("managerfamwealth/listwealth.jsp").forward(request, response);
		
	}

}
