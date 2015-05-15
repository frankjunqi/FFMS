package com.gem.ffms.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.MemorialDao;
import com.gem.ffms.entity.RemindInFo;
import com.gem.ffms.impl.MemorialImpl;

public class RemindServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		String rem_id = request.getParameter("rem_id");
		
		String rem_content = request.getParameter("remindcontent");
		String rem_remindtime = request.getParameter("remindtime");
		System.out.println("--------method-----,"+method+"  ,--rem_id----"+rem_id); 
		if(method.equals("delete")){
			RemindServlet rs = new RemindServlet();
			rs.deleteRemind(Integer.parseInt(rem_id));
			request.getRequestDispatcher("index.html").forward(request, response);
		
		request.getRequestDispatcher("other/deletremindsuccess.jsp").forward(request, response);
		
		}else if(method.equals("add")){
			try {
				RemindInFo rem = new RemindInFo();
				rem.setRem_content(rem_content);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				rem.setRem_remindtime(sdf.parse(rem_remindtime));
				rem.setRem_createtime(new java.util.Date());
				this.addRemind(rem);
				
				request.getRequestDispatcher("RemindServlet").forward(request, response);
				
			} catch (ParseException e) {
				System.out.println("日期不能转换");
				e.printStackTrace();
			}
		}
		
	}
	
	public void deleteRemind(int rem_id){
		MemorialDao md = new MemorialImpl();
		md.delteRemindFo(rem_id);
		
	}
	
	
	public void addRemind(RemindInFo rem){
		MemorialDao md = new MemorialImpl();
		
		md.saveMemorial(rem);
	}
}
