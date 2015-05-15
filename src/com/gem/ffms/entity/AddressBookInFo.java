package com.gem.ffms.entity;

public class AddressBookInFo {
	private int ab_id;
	
	private int u_id;
	
	private String ab_name;
	
	private String ab_address;
	
	private String ab_tel;
	

	public int getAb_id() {
		return ab_id;
	}

	public int getU_id() {
		return u_id;
	}

	public String getAb_name() {
		return ab_name;
	}

	public String getAb_address() {
		return ab_address;
	}

	public String getAb_tel() {
		return ab_tel;
	}

	public void setAb_id(int ab_id) {
		this.ab_id = ab_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public void setAb_name(String ab_name) {
		this.ab_name = ab_name;
	}

	public void setAb_address(String ab_address) {
		this.ab_address = ab_address;
	}

	public void setAb_tel(String ab_tel) {
		this.ab_tel = ab_tel;
	}

	@Override
	public String toString() {
		return "AddressBookInFo [ab_id=" + ab_id + ", u_id=" + u_id
				+ ", ab_name=" + ab_name + ", ab_address=" + ab_address
				+ ", ab_tel=" + ab_tel + "]";
	}
	
	
}
