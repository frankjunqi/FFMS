package com.gem.ffms.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.gem.ffms.dao.DBUtil;
import com.gem.ffms.dao.MemorialDao;
import com.gem.ffms.entity.RemindInFo;
import com.gem.ffms.entity.User;
import com.gem.ffms.util.MySQLJDBCImpl;

public class MemorialImpl implements MemorialDao{
	private DBUtil dbutil;
	
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	
	public MemorialImpl(){
		dbutil= new MySQLJDBCImpl();
	}

	

	public void saveMemorial(RemindInFo rem  ) {
		try {
//			con.setAutoCommit(false);
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//			String createtime = sd.format(new java.util.Date());
//			String remindtime = sd.format(rem.getRem_remindtime());
			con = dbutil.getConnection();
			pstmt = con.prepareStatement("insert into remindinfo_table(rem_content,rem_remintime,rem_createtime) value (?,?,?)");
			pstmt.setString(1, rem.getRem_content());
			pstmt.setString(2, sd.format(rem.getRem_remindtime()));
			pstmt.setString(3, sd.format(rem.getRem_createtime()));
			pstmt.execute();
//			con.setAutoCommit(true);
//			con.commit();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
				dbutil.closePreparedStatement(pstmt);
				dbutil.closeConnection(con);
		}
		

	}

	public List<RemindInFo> getRemList() {
		List<RemindInFo> remlist = new ArrayList<RemindInFo>();
		
		try {
			con = dbutil.getConnection();
			pstmt = con.prepareStatement("select * from remindinfo_table");
			rs = pstmt.executeQuery();
			while(rs.next()){
				RemindInFo rem = new RemindInFo();
				rem.setRem_id(rs.getInt("rem_id"));
				rem.setRem_content(rs.getString("rem_content"));
				rem.setRem_remindtime(rs.getDate("rem_remintime"));
				rem.setRem_createtime(rs.getDate("rem_createtime"));
				remlist.add(rem);
			}
			System.out.println(remlist.size());
			return remlist;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void delteRemindFo(int rem_id){
		try {
			con = dbutil.getConnection();
	
			pstmt = con.prepareStatement("delete from remindinfo_table where rem_id = ?");
			pstmt.setInt(1, rem_id);
			pstmt.execute();
			
			
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	
	}



	public void addAddress(RemindInFo remind) {
		// TODO Auto-generated method stub
		
	}



	public void deleteAddress(int remid) {
		// TODO Auto-generated method stub
		
	}

	public void updateRemind(RemindInFo rem){
		try {
			con = dbutil.getConnection();
		System.out.println(rem+"-----~~~~~~~++++++++++++"+rem.getRem_id());
			con = dbutil.getConnection();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			pstmt = con.prepareStatement("update remindinfo_table set rem_content = ? ,rem_remintime=?where rem_id =?");
			pstmt.setString(1, rem.getRem_content());
			pstmt.setString(2, sdf.format(rem.getRem_remindtime()));
			pstmt.setInt(3, rem.getRem_id());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeConnection(con);
		}
	}
}


