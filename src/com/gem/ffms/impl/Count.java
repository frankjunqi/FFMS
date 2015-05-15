package com.gem.ffms.impl;

import java.util.List;

import com.gem.ffms.dao.CountDao;
import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;

public class Count implements CountDao {

	public List<IncomeInfo> inReport(IncomeInfo income) {
		StringBuilder sbSql=new StringBuilder();
		sbSql.append("select * from IncomeInfo where ");
		if(String.valueOf(income.getI_year())!="")
		{
			
		}
		return null;
	}

	public List<OutputInfo> outReport(OutputInfo output) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Double> getEveryMonthIncome(String year) {
		// TODO Auto-generated method stub
		return null;
	}

}
