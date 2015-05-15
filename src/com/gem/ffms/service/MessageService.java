package com.gem.ffms.service;

import java.util.List;

import com.gem.ffms.dao.MessageDao;
import com.gem.ffms.entity.AddressBookInFo;
import com.gem.ffms.impl.MessageDaoImpl;

public class MessageService {
	private MessageDao md;

	public MessageService() {
		md = new MessageDaoImpl();
	}

	public void saveAddress(AddressBookInFo ab) {
		md.saveAddress(ab);
	}

	public void deleteAddress(int id) {
		md.deleteAddress(id);
	}

	public List<AddressBookInFo> getAddressList() {
		List<AddressBookInFo> addlist = md.getAddressList();
		return addlist;
	}

	public void updateAdrss(AddressBookInFo ab) {
		md.updateAdrss(ab);
	}
}
