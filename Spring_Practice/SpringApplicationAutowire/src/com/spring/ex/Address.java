package com.spring.ex;

public class Address {
	private String htwn;
	private String state;
	private String disrict;
	public String getHtwn() {
		return htwn;
	}
	public void setHtwn(String htwn) {
		this.htwn = htwn;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDisrict() {
		return disrict;
	}
	public void setDisrict(String disrict) {
		this.disrict = disrict;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String htwn, String state, String disrict) {
		super();
		this.htwn = htwn;
		this.state = state;
		this.disrict = disrict;
	}
	@Override
	public String toString() {
		return "Address [htwn=" + htwn + ", state=" + state + ", disrict=" + disrict + "]";
	}
	
}
