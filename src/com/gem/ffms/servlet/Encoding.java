package com.gem.ffms.servlet;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Encoding implements javax.servlet.Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
			request .setCharacterEncoding("UTF-8"); 
			chain.doFilter(request, response); 
		
	}

	public void init(FilterConfig chain) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
