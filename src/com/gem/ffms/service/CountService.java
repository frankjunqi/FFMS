package com.gem.ffms.service;

import java.util.List;

import com.gem.ffms.dao.CountDao;
import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.impl.CountDaoImpl;

public class CountService {
	private CountDao cd ;

	public CountService() {
		cd = new CountDaoImpl();
	}
	
	
	public List<Double> getEveryMonthIncome(String year){
		
		List<Double> list = cd.getEveryMonthIncome(year);
		
		return list;
	}
	
	
	
}
