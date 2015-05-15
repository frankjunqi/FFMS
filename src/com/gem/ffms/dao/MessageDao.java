package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.AddressBookInFo;

/*
 * 定义了通讯录的接口
 */
public interface MessageDao {
	public void saveAddress(AddressBookInFo ab);
	
	public void deleteAddress(int id);
	
	public List<AddressBookInFo> getAddressList();
	
	public void updateAdrss(AddressBookInFo ab);
	
}
