package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.service.MessageService;

public class DeleteMessageServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		MessageService ms = new MessageService();
		String adid = request.getParameter("id");
		if(method.equals("delete")){
			ms.deleteAddress(Integer.parseInt(adid));
			request.getRequestDispatcher("getMessageServlet").forward(request, response);
		}else if(method.equals("udpate")){
				
			
//			ms.updateAdrss(ab)
		}
		
	}
	

}
