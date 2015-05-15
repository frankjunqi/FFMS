package com.gem.ffms.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gem.ffms.dao.DBUtil;
import com.gem.ffms.dao.WealthDao;
import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;
import com.gem.ffms.util.MySQLJDBCImpl;

public class WealthDaoImpl implements WealthDao {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	/**
	 * 此方法是用来消费记录的，
	 * @param num 存钱
	 * @param time 时间
	 * @param u_id 用户的Id
	 * @param on_id 参照存钱类型表（inputnameinfo_talbe）只有参照这个表里的数据的时候才允许存储111
	 */
	public void saveInCome(double num , String time ,int u_id,int in_id) {
		DBUtil db = new MySQLJDBCImpl();
		try {
			String[] timeinfo = time.split("-");
			
			System.out.println(num+", "+timeinfo[0]+", "+timeinfo[1]+","+timeinfo[2]
							+", "+time+" , "+u_id+" , "+in_id
			);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dtime = sdf.parse(time);
			conn = db.getConnection();

			String sql = "insert into incomeinfo_table(i_num,i_year,i_month,i_day,i_createtime,i_isdel,u_id,in_id)"
				+" value (?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, num);
			pstmt.setString(2, timeinfo[0]);
			pstmt.setString(3, timeinfo[1]);
			pstmt.setString(4, timeinfo[2]);
			pstmt.setString(5, sdf.format(dtime));
			pstmt.setInt(6, 1);
			pstmt.setInt(7,u_id);
			pstmt.setInt(8, in_id);
			pstmt.execute();
				
		} catch (Exception e) {
				System.out.println("保存失败");
				e.printStackTrace();
		
		}
		
	}

	public void saveOutput(double num, String time, int u_id, int on_id) {
		// TODO Auto-generated method stub
		DBUtil  db = new MySQLJDBCImpl();
		try{
			String[] timeinfo = time.split("-");
			System.out.println(num+","+timeinfo[0]+","+timeinfo[1]+","+timeinfo[2]+", "+time+" , "+u_id+" , "+on_id);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date dtime = sdf.parse(time);
			conn = db.getConnection();
			String sql = "insert into outputinfo_table(o_num, o_year, o_month, o_day, o_isdel, u_id, on_id) value(?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, num);
			pstmt.setString(2, timeinfo[0]);
			pstmt.setString(3, timeinfo[1]);
			pstmt.setString(4, timeinfo[2]);
			pstmt.setInt(5, 1);
			pstmt.setInt(6,u_id);
			pstmt.setInt(7, on_id);
			pstmt.execute();
		}catch(Exception e){
			e.printStackTrace();

		}
		
		

	}
/**
 * 根据存钱的Id来修改这条记录，此方法接收两个用户的参数，一个是时间，一个是修改的钱
 * @param i_id
 * @param time
 * @param i_num
 */
	public void udpateIncome(double num , String time ,int u_id,int in_id ,int i_id) {
		// TODO Auto-generated method stub
		DBUtil db = new MySQLJDBCImpl();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			String[] timeinfo = time.split("-");
			System.out.println("~~~~~~ "+num+","+timeinfo[0]+","+timeinfo[1]+","+timeinfo[2]+", "+time+" , "+u_id);
			conn = db.getConnection();
			String sql = "update incomeinfo_table set i_num = ? , i_year= ?   , i_month=?,i_day= ? where  i_id = ?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, num);
			pstmt.setString(2, timeinfo[0]);
			pstmt.setString(3, timeinfo[1]);
			pstmt.setString(4, timeinfo[2]);
			//pstmt.setString(5, time);
			pstmt.setInt(5, i_id);
			pstmt.executeUpdate();
				
		} catch (Exception e) {
				System.out.println("修改失败");
				e.printStackTrace();
		
		}finally{
			
			db.closePreparedStatement(pstmt);
			db.closeConnection(conn);
		}
		
	}

	public void updateOutput() {
		

	}


	/**
	 * 得到所有的存储存钱记录集合
	 */
	public List<IncomeInfo> getIncomeInfoList() {
//		String[] timeinfo = time.split("-");
		DBUtil db = new MySQLJDBCImpl();
		List<IncomeInfo> list = new ArrayList<IncomeInfo>();
		
		try {
			String sql = "select * from incomeinfo_table";
			conn = db.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				IncomeInfo inc  = new IncomeInfo();
				inc.setI_id(rs.getInt("i_id"));
				inc.setI_num(rs.getDouble("i_num"));
				inc.setU_id(rs.getInt("u_id"));
				inc.setIn_id(rs.getInt("in_id"));
				inc.setI_day(rs.getString("i_day"));
				inc.setI_month(rs.getString("i_month"));
				inc.setI_year(rs.getString("i_year"));
				inc.setI_createtime(rs.getDate("i_createtime"));
				list.add(inc);
			}
			
			return list;
			
			
			
		} catch (Exception e) {
			db.closeResultSet(rs);
			db.closePreparedStatement(pstmt);
			db.closeConnection(conn);
		}
		
		
		
		
		return null;
	}

	public void saveOutput(OutputInfo o) {
		DBUtil db = new MySQLJDBCImpl();
		try {
			conn = db.getConnection();
			String sql = "insert into outputinfo_table(o_num, o_year, o_month, o_day, o_isdel, u_id, on_id) value(?,?,?,?,?,?,?)"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, o.getO_num());
			pstmt.setString(2, o.getO_year());
			pstmt.setString(3, o.getO_month());
			pstmt.setString(4, o.getO_day());
			pstmt.setInt(5, 1);
			pstmt.setInt(6, o.getU_id());
			pstmt.setInt(7, o.getOn_id());
			pstmt.executeUpdate();
				
		} catch (Exception e) {
				System.out.println("修改失败");
				e.printStackTrace();
		
		}finally{
			
			db.closePreparedStatement(pstmt);
			db.closeConnection(conn);
		}
		
		
		
	}

	/* (non-Javadoc)
	 * @see com.gem.ffms.dao.WealthDao#getOutputInfoList()
	 */
	public List<OutputInfo> getOutputInfoList() {
		
		DBUtil db = new MySQLJDBCImpl();
		List<OutputInfo> list = new ArrayList<OutputInfo>();
		
		try {
			String sql = "select * from outputinfo_table";
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				OutputInfo op = new OutputInfo();
				op.setO_id(rs.getInt("o_id"));
				op.setO_num(rs.getDouble("o_num"));
				op.setO_year(rs.getString("o_year"));
				op.setO_month(rs.getString("o_month"));
				op.setO_day(rs.getString("o_day"));
				op.setU_id(rs.getInt("u_id"));
				op.setOn_id(rs.getInt("o_id"));
				
				list.add(op);
				
				System.out.println("++++++++++++++++++" + rs.getInt("o_id"));
				
			}
			
			return list;
			
			
			
		} catch (Exception e) {
			db.closeResultSet(rs);
			db.closePreparedStatement(pstmt);
			db.closeConnection(conn);
		}
		
		
		return null;
	}

	


	
	

	


}
