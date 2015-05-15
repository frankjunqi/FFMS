package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.AddressBookInFo;
import com.gem.ffms.service.MessageService;



public class UpdateAddressServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ab_id = request.getParameter("ab_id");
		String name = request.getParameter("ab_name");
		String address = request.getParameter("ab_address");
		String tel = request.getParameter("ab_tel");
		System.out.println("****** "+ab_id );
		System.out.println("****** "+name );
		System.out.println("****** "+address );
		System.out.println("****** "+tel);
		AddressBookInFo ab = new AddressBookInFo();
		
		ab.setAb_address(address);
		ab.setAb_tel(tel);
		ab.setAb_name(name);
		ab.setAb_id(Integer.parseInt(ab_id.trim()));
		
		MessageService ms = new MessageService();
		ms.updateAdrss(ab);
		
		request.getRequestDispatcher("getMessageServlet").forward(request, response);
		
	}
	
	
}
