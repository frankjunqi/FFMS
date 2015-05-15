package com.gem.ffms.servlet;
/**
 * 赵庆静
 * 
 * 查询员工信息的servlet
 * */
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gem.ffms.dao.UserDao;
import com.gem.ffms.entity.User;
import com.gem.ffms.impl.UserDaoImpl;

public class QueryUserServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}
            
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        //创建服务对象
		UserDao ud=new UserDaoImpl();
		User user=new User();
		List list=ud.queryAll();
		//从前台接收数据
//		String u_id=request.getParameter("u_id");
//		if(user!=null){
//			request.setAttribute("user", user);
		if(list.size()!=0)
		{
			System.out.println("有值");
		//提交数据到数据库里
			request.setAttribute("list",list);
			System.out.println("lsit size     = "+ list.size());
		//进行页面跳转
			request.getRequestDispatcher("managerfammember/queryinfo.jsp").forward(request, response);
		}
		
	}

}

