package com.gem.ffms.service;

import com.gem.ffms.dao.MemorialDao;
import com.gem.ffms.entity.RemindInFo;
import com.gem.ffms.entity.User;
import com.gem.ffms.impl.MemorialImpl;

public class RemindService {
	private MemorialDao md;

	public RemindService() {
		md = new MemorialImpl();
	};
	
	
	public void saveRemind(RemindInFo rif){
		md.saveMemorial(rif);
	}
	
	
	public void delteRemind(int id ){
		md.delteRemindFo(id);
	}
	
	public void updateRemind(RemindInFo rem){
		md.updateRemind(rem);
	}
	
}
