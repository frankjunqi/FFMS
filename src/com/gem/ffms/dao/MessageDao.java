package com.gem.ffms.dao;

import java.util.List;

import com.gem.ffms.entity.AddressBookInFo;

/*
 * ������ͨѶ¼�Ľӿ�
 */
public interface MessageDao {
	public void saveAddress(AddressBookInFo ab);
	
	public void deleteAddress(int id);
	
	public List<AddressBookInFo> getAddressList();
	
	public void updateAdrss(AddressBookInFo ab);
	
}
