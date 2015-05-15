package com.gem.ffms.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.gem.ffms.dao.DBUtil;


public class MySQLJDBCImpl implements DBUtil {
	private static Connection conn=null;
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://10.110.5.102:3306/ffms";
	private static String username="root"; 
	private static String password="111111";
	
	
	public Connection getConnection() {
		try{

				Class.forName(driverName);
				conn=DriverManager.getConnection(url, username, password);
				if(conn!=null){
					System.out.println("We have successfully established a connection to the mysql ......");
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}

	public void closeConnection(Connection con) {
		try{
			if(!conn.isClosed()){
				conn.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void closePreparedStatement(PreparedStatement pstmt) {
		try{
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void closeResultSet(ResultSet rs) {
		try{
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	public void closeStatement(Statement stmt) {
		try{
			stmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		try {
			MySQLJDBCImpl m = new MySQLJDBCImpl();
			Connection con = m.getConnection();
			Statement stmt = con.createStatement();
			String sql = "insert into student value(10,'aa','123',1)";
			stmt.executeUpdate(sql);
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
