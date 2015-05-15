package com.gem.ffms.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.gem.ffms.dao.DBUtil;
import com.gem.ffms.dao.UserDao;
import com.gem.ffms.entity.User;
import com.gem.ffms.util.MySQLJDBCImpl;
/**
 * 赵庆静
 * 实现接口UserDao的方法
 * 操作家庭成员信息
 * */
public class UserDaoImpl implements UserDao{
	private static Connection conn=null;
	private static PreparedStatement pstmt=null;
	private static ResultSet rs=null;

	//添加管理成员信息
	public void saveUser(User user)
	{	
		DBUtil DB = new MySQLJDBCImpl();
		try
		{
		conn=DB.getConnection();
		conn.setAutoCommit(false);
		String sql="insert into userinfo_table(u_username,u_password," +
				"u_sex,u_birthday,u_tel,u_createtime,u_isdel,r_id)" +
				" values(?,?,?,?,?,?,?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,user.getU_username());
		pstmt.setString(2,user.getU_password());
		pstmt.setString(3,user.getU_sex());
		pstmt.setString(4,user.getU_birthday());
		pstmt.setString(5,user.getU_tel());
		pstmt.setString(6,user.getU_createtime());
		pstmt.setInt(7, 1);
		pstmt.setInt(8,user.getR_id());
		pstmt.executeUpdate();
		conn.commit();
		conn.setAutoCommit(true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DB.closePreparedStatement(pstmt);
			DB.closeConnection(conn);
			
		}
	}
	//修改更新成员信息


	public void updateUser(User user) {

		DBUtil DB = new MySQLJDBCImpl();
		try
		{
		conn=DB.getConnection();
		conn.setAutoCommit(false);
		String sql="update userInfo_table set u_username=?,u_password=?,u_sex=?,u_birthday=?," +
				"u_tel=?,u_createtime=?,u_isdel=?,r_id=? where u_id=?";
		System.out.println("=======+++0 " +user.getU_sex());
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, user.getU_username());
		pstmt.setString(2, user.getU_password());
		pstmt.setString(3, user.getU_sex());
		pstmt.setString(4, user.getU_birthday());
		pstmt.setString(5,user.getU_tel());
	    pstmt.setString(6,user.getU_createtime());
		pstmt.setInt(7, 1);
		pstmt.setInt(8, user.getR_id());
		pstmt.setInt(9, user.getU_id());
		pstmt.executeUpdate();
		conn.commit();
		conn.setAutoCommit(true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DB.closePreparedStatement(pstmt);
			DB.closeConnection(conn);
		}

		
		
	}

	public void deleteUser(int user_id) {

		DBUtil DB = new MySQLJDBCImpl();
		try
		{
		   conn=DB.getConnection();
		   conn.setAutoCommit(false);
		   System.out.println(user_id);
		   String sql="delete from  userinfo_table  where u_id=?";
		   pstmt=conn.prepareStatement(sql);
		   pstmt.setInt(1, user_id);
		   pstmt.executeUpdate();
		   conn.commit();
		   conn.setAutoCommit(true);
   }catch(Exception e)
   {
	   e.printStackTrace();
   }finally
   {
	   DB.closePreparedStatement(pstmt);
	   DB.closeConnection(conn);
   }

		
		

	}
	//根据id查询用户
	public User queryStuById(int user_id) {
		User user=new User();
		DBUtil DB = new MySQLJDBCImpl();
		try {
			conn=DB.getConnection();
			String sql="select * from userinfo_table where u_id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,user_id);
			rs=pstmt.executeQuery();
			while(rs.next()){
				user.setU_id(rs.getInt(1));
				user.setU_username(rs.getString(2));
				user.setU_password(rs.getString(3));
				user.setU_sex(rs.getString(4));
				user.setU_tel(rs.getString(6));
				user.setU_createtime(rs.getString(7));
				user.setU_birthday(rs.getString(5));
				user.setR_id(rs.getInt(8));
				
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally{
			 DB.closeResultSet(rs);
			 DB.closePreparedStatement(pstmt);
			 DB.closeConnection(conn);
		}
		return user;
	}
	//查询所有家庭用户信息
	public List queryAll() {
		   List list=new ArrayList();
		   DBUtil DB = new MySQLJDBCImpl();
		try
		{  
			   conn=DB.getConnection();
			   String sql="select * from  userinfo_table  ";
			   pstmt=conn.prepareStatement(sql);
			   rs=pstmt.executeQuery();
			   while(rs.next())
			   {
				 User user=new User();
				 user.setU_id(rs.getInt(1));
				 user.setU_username(rs.getString(2));
				 user.setU_password(rs.getString(3));
				 user.setU_sex(rs.getString(4));
				 user.setU_birthday(rs.getString(5));
				 user.setU_tel(rs.getString(6));
				 user.setU_createtime(rs.getString(7));
				 user.setU_isdel(1);
				 user.setR_id(rs.getInt(9));
				 list.add(user);
			   }
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally 
		{
			DB.closeResultSet(rs);
			DB.closePreparedStatement(pstmt);
			DB.closeConnection(conn);
		}
		return list;
		}


	public User getUserByName(String username) {
		DBUtil dbuitl = null;
		try {
			dbuitl = new MySQLJDBCImpl();
			conn = dbuitl.getConnection();
			String sql="select * from userinfo_table where u_username like ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+username+"%");
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				User user = new User();
System.out.println(rs.getInt("u_id")+" !!!! need to update..");
				user.setU_id(rs.getInt("u_id"));
				user.setU_username(rs.getString("u_username"));
				user.setU_password(rs.getString("u_password"));
				user.setU_tel(rs.getString("u_tel"));
				return user;
			}
			
	
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			dbuitl.closeResultSet(rs);
			dbuitl.closePreparedStatement(pstmt);
			dbuitl.closeConnection(conn);
		}

		return null;

	}



}
