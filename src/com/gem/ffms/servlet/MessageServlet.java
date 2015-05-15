package com.gem.ffms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.entity.AddressBookInFo;
import com.gem.ffms.service.MessageService;
/**
 * 获取通讯录的Servlet
 * @author Administrator
 *
 */
public class MessageServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MessageService ms = new MessageService();
		
		List<AddressBookInFo> addlist = ms.getAddressList();
		for(AddressBookInFo add : addlist){
			System.out.println(add);
		}
		
		request.setAttribute("addlist", addlist);
		request.getRequestDispatcher("other/listaddressbook.jsp").forward(request, response);
		
		
		
		
		
	}

}
