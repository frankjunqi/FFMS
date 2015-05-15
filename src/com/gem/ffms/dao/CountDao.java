package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;

public interface CountDao {
	/*
	 * 根据查询条件返回List<>集合
	 * @param income 查询条件
	 * @return List<IncomeInfo> 返回List类型
	 * */
	public List<IncomeInfo> inReport(IncomeInfo income);
	
	/*
	 * 根据查询条件返回List<>集合
	 * @param output 查询条件
	 * @return List<OutputInfo> 返回List类型
	 * */
	public List<OutputInfo> outReport(OutputInfo output);
	/**
	 * 根据输入的年份,查询当年各个月份所有的收入总和
	 * @param year
	 * @return
	 */
	public List<Double> getEveryMonthIncome(String year);
}
