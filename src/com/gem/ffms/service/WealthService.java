package com.gem.ffms.service;

import java.util.List;

import com.gem.ffms.dao.WealthDao;
import com.gem.ffms.entity.IncomeInfo;
import com.gem.ffms.entity.OutputInfo;
import com.gem.ffms.impl.WealthDaoImpl;

public class WealthService {
	private WealthDao wd;

	public WealthService() {
		wd = new WealthDaoImpl();
	}

	public void saveInCome(double num, String time, int u_id, int in_id) {

		wd.saveInCome(num, time, u_id, in_id);
	}

	public void updateInCome(double num, String time, int u_id, int in_id,
			int i_id) {
		wd.udpateIncome(num, time, u_id, in_id, i_id);
	}

	public List<IncomeInfo> getIncomeList() {
		return wd.getIncomeInfoList();
	}

	public void saveOutputinfo(OutputInfo o) {
		wd.saveOutput(o);
	}

	public List<OutputInfo> getoutputlist() {
		return wd.getOutputInfoList();
	}

}
