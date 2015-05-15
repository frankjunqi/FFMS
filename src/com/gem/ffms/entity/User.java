package com.gem.ffms.entity;

import java.util.Date;
/**
 * 赵庆静
 * 
 * */
public class User {
	private int u_id;
    //定义用户id
	private int r_id;
	//定义角色编号id
	private String u_username;
	//定义用户名称
	private String u_password;
	//定义用户密码
	private String u_sex;
	//用户性别
	private String u_birthday;
	//用户生日
	private String u_tel;
	//用户电话
	private String u_createtime;
	//用户注册日期
	private int u_isdel;
    //是否隐藏
	
	
	/**
	 * 以下是get()
	 * set()方法
	 * 用以外部数据访问
	 * */
	public int getU_id() {
		return u_id;
	}

	public int getR_id() {
		return r_id;
	}

	public String getU_username() {
		return u_username;
	}

	public String getU_password() {
		return u_password;
	}


	public String getU_birthday() {
		return u_birthday;
	}

	public String getU_tel() {
		return u_tel;
	}

	public String getU_createtime() {
		return u_createtime;
	}

	

	public int getU_isdel() {
		return u_isdel;
	}

	public void setU_isdel(int u_isdel) {
		this.u_isdel = u_isdel;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public void setU_username(String u_username) {
		this.u_username = u_username;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	

	public void setU_birthday(String u_birthday) {
		this.u_birthday = u_birthday;
	}

	public void setU_tel(String u_tel) {
		this.u_tel = u_tel;
	}

	public void setU_createtime(String u_createtime) {
		this.u_createtime = u_createtime;
	}


	
	
	public String getU_sex() {
		return u_sex;
	}

	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", r_id=" + r_id + ", u_username="
				+ u_username + ", u_password=" + u_password + ", u_sex="
				+ u_sex + ", u_birthday=" + u_birthday + ", u_tel=" + u_tel
				+ ", u_createtime=" + u_createtime + ", u_isdel=" + u_isdel
				+ "]";
	}
	
	
	
}
