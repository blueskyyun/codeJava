package com.videoStore.beanEntity;

public class DeliveryAddress {
	private String receiver;
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getDatailAddr() {
		return datailAddr;
	}
	public void setDatailAddr(String datailAddr) {
		this.datailAddr = datailAddr;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	private int phoneno;
	private String datailAddr;
	private String area;
}
