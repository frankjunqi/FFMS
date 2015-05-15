package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;

public interface CountDao {
	/*
	 * ���ݲ�ѯ��������List<>����
	 * @param income ��ѯ����
	 * @return List<IncomeInfo> ����List����
	 * */
	public List<IncomeInfo> inReport(IncomeInfo income);
	
	/*
	 * ���ݲ�ѯ��������List<>����
	 * @param output ��ѯ����
	 * @return List<OutputInfo> ����List����
	 * */
	public List<OutputInfo> outReport(OutputInfo output);
	/**
	 * ������������,��ѯ��������·����е������ܺ�
	 * @param year
	 * @return
	 */
	public List<Double> getEveryMonthIncome(String year);
}
