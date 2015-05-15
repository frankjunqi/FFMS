package com.gem.ffms.entity;

import java.util.Date;

public class IncomeInfo {
	private int i_id;
	
	private double i_num;
	
	private String  i_year;
	
	private String i_month;
	
	private String i_day;
	
	private int i_isdel;
	
	private Date i_createtime;
	
	private int u_id;
	
	private int in_id;

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public double getI_num() {
		return i_num;
	}

	public void setI_num(double i_num) {
		this.i_num = i_num;
	}

	public String getI_year() {
		return i_year;
	}

	public void setI_year(String i_year) {
		this.i_year = i_year;
	}

	public String getI_month() {
		return i_month;
	}

	public void setI_month(String i_month) {
		this.i_month = i_month;
	}

	public String getI_day() {
		return i_day;
	}

	public void setI_day(String i_day) {
		this.i_day = i_day;
	}

	public int isI_isdel() {
		return i_isdel;
	}

	public void setI_isdel(int i_isdel) {
		this.i_isdel = i_isdel;
	}

	public Date getI_createtime() {
		return i_createtime;
	}

	public void setI_createtime(Date i_createtime) {
		this.i_createtime = i_createtime;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public int getIn_id() {
		return in_id;
	}

	public void setIn_id(int in_id) {
		this.in_id = in_id;
	}
}
