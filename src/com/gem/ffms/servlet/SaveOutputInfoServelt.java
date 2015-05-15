package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.OutputInfo;
import com.gem.ffms.service.WealthService;

public class SaveOutputInfoServelt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uid = request.getParameter("u_id");	
		String num = request.getParameter("num");
		String time = request.getParameter("time");
		System.out.println("uid="+uid+",num "+num  +",time "+time);
		OutputInfo o = new OutputInfo();
		String[] times = time.split("-");
		o.setO_num(Double.parseDouble(num.trim()));
		o.setO_year(times[0]);
		o.setO_month(times[1]);
		o.setO_day(times[2]);
		o.setU_id(Integer.parseInt(uid.trim()));
		o.setOn_id(1);
//		o.setO_isdel(1);
		WealthService ws = new WealthService();
		ws.saveOutputinfo(o);
		
		request.getRequestDispatcher("GetOutputListServlet").forward(request, response);
		
	}
		
}
