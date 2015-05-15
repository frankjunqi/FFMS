package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.AddressBookInFo;
import com.gem.ffms.service.MessageService;

public class AddMessageServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doDelete(request, response);
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id  = request.getParameter("u_id");
		String name = request.getParameter("ab_name");
		String address = request.getParameter("ab_address");
		String tel = request.getParameter("ab_tel");
		System.out.println(id+",  "+ name+", " + address +", "+tel);
		AddressBookInFo ab = new AddressBookInFo();
		ab.setAb_address(address);
		ab.setAb_name(name);
		ab.setAb_tel(tel);
		ab.setU_id(Integer.parseInt(id));
		
		
		MessageService ms = new MessageService();
		ms.saveAddress(ab);
		
		request.getRequestDispatcher("getMessageServlet").forward(request, response);
		
		
		
		
	}

}
