package com.gem.ffms.entity;

import java.util.Date;

public class RemindInFo {
	private int rem_id;
	
	private String rem_content;

	private Date rem_remindtime;
	
	private Date rem_createtime;

	public int getRem_id() {
		return rem_id;
	}

	public String getRem_content() {
		return rem_content;
	}

	public Date getRem_remindtime() {
		return rem_remindtime;
	}

	

	public void setRem_id(int rem_id) {
		this.rem_id = rem_id;
	}

	public void setRem_content(String rem_content) {
		this.rem_content = rem_content;
	}

	public void setRem_remindtime(Date rem_remindtime) {
		this.rem_remindtime = rem_remindtime;
	}

	public Date getRem_createtime() {
		return rem_createtime;
	}

	public void setRem_createtime(Date rem_createtime) {
		this.rem_createtime = rem_createtime;
	}

	@Override
	public String toString() {
		return "RemindInFo [rem_id=" + rem_id + ", rem_content=" + rem_content
				+ ", rem_remindtime=" + rem_remindtime + ", rem_createtime="
				+ rem_createtime + "]";
	}


		
	
	
	
}
