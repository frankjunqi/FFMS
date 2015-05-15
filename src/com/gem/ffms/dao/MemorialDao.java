package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.RemindInFo;



public interface MemorialDao {
	
	
public void addAddress(RemindInFo remind);
	
	public void deleteAddress(int remid);
	
	
	public void saveMemorial(RemindInFo rem );
	
	
	public List<RemindInFo> getRemList();
	
	
	public void delteRemindFo(int rem_id);
	
	public void updateRemind(RemindInFo rem);
}
