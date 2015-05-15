package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;

public interface WealthDao {
public void saveInCome(double num , String time ,int u_id,int in_id);
	
	public void saveOutput(OutputInfo o);
	
	public void udpateIncome(double num , String time ,int u_id,int in_id ,int i_id);
		
	
	public  List<IncomeInfo> getIncomeInfoList();
	
	public List<OutputInfo> getOutputInfoList();
	
	
	
}
