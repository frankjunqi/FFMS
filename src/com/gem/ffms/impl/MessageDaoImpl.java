package com.gem.ffms.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gem.ffms.dao.DBUtil;
import com.gem.ffms.dao.MessageDao;
import com.gem.ffms.entity.AddressBookInFo;
import com.gem.ffms.util.MySQLJDBCImpl;

public class MessageDaoImpl implements MessageDao {
	private DBUtil dbutil;

	private static Connection con=null;
	private static PreparedStatement pstmt=null;
	private static ResultSet rs=null;

	
	
	
	public MessageDaoImpl() {
		dbutil = new MySQLJDBCImpl();
	}

	public void saveAddress(AddressBookInFo ab) {
		con = dbutil.getConnection();
		try {
			System.out.println(ab.getU_id()+"~~~~~~~~");
			pstmt = con.prepareStatement("insert into addressbookinfo_table (ab_name,ab_address,ab_tel,u_id) value (?,?,?,?)");
			pstmt.setString(1, ab.getAb_name());
			pstmt.setString(2, ab.getAb_address());
			pstmt.setString(3, ab.getAb_tel());
			pstmt.setInt(4, ab.getU_id());
			pstmt.execute();
			
		}catch(SQLException e){
			
			e.printStackTrace();
		}finally{
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeConnection(con);
		}
	}

	public void deleteAddress(int id) {
		try {
			con = dbutil.getConnection();
			pstmt = con.prepareStatement("delete from addressbookinfo_table  where ab_id = ?");
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeConnection(con);
		}
		
	}

	public List<AddressBookInFo> getAddressList() {
		List<AddressBookInFo> ablist = new ArrayList<AddressBookInFo>();
		
		try {
			con = dbutil.getConnection();
			pstmt = con.prepareStatement("select * from addressbookinfo_table");
			rs = pstmt.executeQuery();
			while(rs.next()){
				AddressBookInFo ab = new AddressBookInFo();
				ab.setAb_id(rs.getInt("ab_id"));
				ab.setAb_name(rs.getString("ab_name"));
				ab.setAb_address(rs.getString("ab_address"));
				ab.setAb_tel(rs.getString("ab_tel"));
				ab.setU_id(rs.getInt("u_id"));
				ablist.add(ab);
			}
			System.out.println(ablist.size());
			return ablist;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			dbutil.closeResultSet(rs);
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeConnection(con);
		}
		return null;
	}

	public void updateAdrss(AddressBookInFo ab) {
		
		try {
			con = dbutil.getConnection();
		System.out.println(ab+"-----~~~~~~~++++++++++++"+ab.getAb_id());
			con = dbutil.getConnection();
			pstmt = con.prepareStatement("update addressbookinfo_table set ab_name = ? ,ab_address=?,ab_tel=? where ab_id =?");
			pstmt.setString(1, ab.getAb_name());
			pstmt.setString(2, ab.getAb_address());
			pstmt.setString(3, ab.getAb_tel());
			pstmt.setInt(4, ab.getAb_id());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeConnection(con);
		}
	}

}
