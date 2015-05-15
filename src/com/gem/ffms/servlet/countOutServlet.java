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
import com.gem.ffms.entity.OutputInfo;
import com.gem.ffms.impl.CountDaoImpl;

public class countOutServlet extends HttpServlet {
	CountDao countDaoImpl=new CountDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("start countoutservlet.........");
		PrintWriter out=response.getWriter();
		
		
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String id = request.getParameter("id");
		System.out.println(year+", "+month+", "+ day+", "+ id);
		
		
		try
		{
			OutputInfo output=new OutputInfo();
			output.setO_year(request.getParameter("year"));
			output.setO_month(request.getParameter("month"));
			output.setO_day(request.getParameter("day"));
			output.setU_id(Integer.parseInt(request.getParameter("id")));

			List<OutputInfo> list=countDaoImpl.outReport(output);

			double totalNum=0;
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				OutputInfo item=(OutputInfo)it.next();
				totalNum+=item.getO_num();
			}
			System.out.println(totalNum);
			request.setAttribute("list", list);
			request.setAttribute("totalNum", totalNum);
			request.getRequestDispatcher("managerfamwealth/OutputReport.jsp").forward(request, response);
			

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
}
