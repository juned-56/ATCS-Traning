package com.spring.ex;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int sid;
	private String sname;
	private int smarks;
	private String scourse;
	//@Autowired //byType
	Address address; 
	//dependent object will create/inject automatically
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired //byName
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public Student(int sid, String sname, int smarks, String scourse, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.scourse = scourse;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", scourse=" + scourse + ", address="
				+ address + "]";
	}
}
