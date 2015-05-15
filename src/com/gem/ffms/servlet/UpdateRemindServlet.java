package com.gem.ffms.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.RemindInFo;
import com.gem.ffms.service.RemindService;

public class UpdateRemindServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String remid = request.getParameter("rem_id");
			String remindtime = request.getParameter("remindtime");
			String remindcontent = request.getParameter("remindcontent");
			System.out.println("****** "+remid );
			System.out.println("****** "+remindtime );
			System.out.println("****** "+remindcontent );
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			RemindInFo rem = new RemindInFo();
			rem.setRem_id(Integer.parseInt(remid));
			rem.setRem_remindtime(sdf.parse(remindtime));
			rem.setRem_content(remindcontent);
			
			RemindService rs = new RemindService();
			rs.updateRemind(rem);
			
			
			request.getRequestDispatcher("getComListServlet").forward(request, response);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		this.doPost(request, response);
		
	
	}
}
