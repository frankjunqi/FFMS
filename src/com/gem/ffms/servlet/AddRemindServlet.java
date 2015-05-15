package com.gem.ffms.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gem.ffms.entity.RemindInFo;
import com.gem.ffms.service.RemindService;

public class AddRemindServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String u_id = request.getParameter("u_id");
			HttpSession session = request.getSession();
			String remindtime = request.getParameter("remindtime");
			String remindcontent = request.getParameter("remindcontent");
			System.out.println(u_id+", " + remindtime +" , "+remindcontent + session.getAttribute("u"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			RemindService rc = new RemindService();
			RemindInFo rif = new RemindInFo();
			rif.setRem_content(remindcontent);
			rif.setRem_createtime(new java.util.Date());
			rif.setRem_remindtime(sdf.parse(remindtime));
			rc.saveRemind(rif);
			request.getRequestDispatcher("getComListServlet").forward(request, response);
		} catch (ParseException e) {
			System.out.println("转换日期异常,插入备忘录的时间 ");
			e.printStackTrace();
		}
		

	}

}
