package com.gem.ffms.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.CountDao;
import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.impl.CountDaoImpl;


public class countServlet extends HttpServlet {
	CountDao countDaoImpl=new CountDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String id = request.getParameter("id");
		System.out.println(year+", "+month+", "+ day+", "+ id);
		
		
		try
		{
			IncomeInfo income=new IncomeInfo();
			income.setI_year(request.getParameter("year"));
			income.setI_month(request.getParameter("month"));
			income.setI_day(request.getParameter("day"));
			income.setU_id(Integer.parseInt(request.getParameter("id")));

			List<IncomeInfo> list=countDaoImpl.inReport(income);

			double totalNum=0;
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				IncomeInfo item=(IncomeInfo)it.next();
				totalNum+=item.getI_num();
			}
			System.out.println(totalNum);
			request.setAttribute("list", list);
			request.setAttribute("totalNum", totalNum);
			request.getRequestDispatcher("weathcount/IncomeReport.jsp").forward(request, response);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}
