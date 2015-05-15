package com.gem.ffms.impl;

import java.util.ArrayList;
import java.util.List;

import com.gem.ffms.dao.CountDao;
import com.gem.ffms.dao.DBUtil;
import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;
import com.gem.ffms.util.MySQLJDBCImpl;
import java.sql.*;


public class CountDaoImpl implements CountDao {
	private DBUtil dbutil=new MySQLJDBCImpl();
	private PreparedStatement pstmt=null;
	private Connection conn=null;
	private ResultSet rs=null;
	
	/*
	 * 实现查询支出信息
	 * @IncomeInfo 查询条件
	 * @List<IncomeInfo> 返回list
	 * */
	public List<IncomeInfo> inReport(IncomeInfo income) {
		try
		{
			List<IncomeInfo> list=new ArrayList() ;
			StringBuilder sbSql=new StringBuilder();
			sbSql.append("select * from IncomeInfo_table where u_id=? ");
			sbSql.append(" and i_year like ? and i_month like ? and i_day like ? and i_isdel=? ");
			conn=dbutil.getConnection();
			pstmt=conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, income.getU_id());
			pstmt.setString(2, "%"+income.getI_year()+"%");
			pstmt.setString(3, "%"+income.getI_month()+"%");
			pstmt.setString(4, "%"+income.getI_day()+"%");
			pstmt.setInt(5,1);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				IncomeInfo item=new IncomeInfo();
				item.setI_id(rs.getInt("i_id"));
				item.setI_day(rs.getString("i_day"));
				item.setI_month(rs.getString("i_month"));
				item.setI_year(rs.getString("i_year"));
				item.setU_id(rs.getInt("u_id"));
				item.setI_num(rs.getDouble("i_num"));
				list.add(item);
			}
			System.out.println(list.size()+"~~~~~~~~~~~~~~~~~");
			return list;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbutil.closeConnection(conn);
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeResultSet(rs);
		}
		return null;
	}

	public List<OutputInfo> outReport(OutputInfo output) {
		try
		{
			List<OutputInfo> list=new ArrayList() ;
			StringBuilder sbSql=new StringBuilder();
			sbSql.append("select * from outputinfo_table where u_id=? ");
			sbSql.append(" and o_year=? and o_month=? and o_day=? and o_isdel=? ");
			conn=dbutil.getConnection();
			pstmt=conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, output.getU_id());
			pstmt.setString(2, output.getO_year());
			pstmt.setString(3, output.getO_month());
			pstmt.setString(4, output.getO_day());
			pstmt.setInt(5,1);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				OutputInfo item=new OutputInfo();
				item.setO_id(rs.getInt("o_id"));
				item.setO_day(rs.getString("O_day"));
				item.setO_month(rs.getString("O_month"));
				item.setO_year(rs.getString("O_year"));
				item.setU_id(rs.getInt("u_id"));
				item.setO_num(rs.getDouble("O_num"));
				list.add(item);
			}
			return list;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbutil.closeConnection(conn);
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeResultSet(rs);
		}
		return null;
	}
	
	/**
	 * 获取某年各个月的的收入总和
	 * @return
	 */
	public List<Double> getEveryMonthIncome(String year){
		
		List<Double> emi = new ArrayList<Double>();
		
		try
		{
			conn=dbutil.getConnection();
			String sql= "select sum(i_num) as num ,i_month from incomeinfo_table where i_year=? group by i_month";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, year);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				emi.add(Double.parseDouble(rs.getString("num")));
			}
			return emi;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			dbutil.closeConnection(conn);
			dbutil.closePreparedStatement(pstmt);
			dbutil.closeResultSet(rs);
		}
		
		
		return null;
	}

}
