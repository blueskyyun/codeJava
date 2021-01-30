package com.videoStore.beanEntity;

import java.util.Date;
import java.util.List;

import sun.java2d.d3d.D3DScreenUpdateManager;

public class Member {
	private String memberName;
	private String password;
	private Date birthdate;
	private String sex;
	public List<DeliveryAddress> dAddrs;
	private int phoneno;
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
}
