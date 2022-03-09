package com.spring.ex;

public class Product {
	private int pid;
	private String pname;
	private int pprice;
	private String prating;
	Address address;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPrating() {
		return prating;
	}
	public void setPrating(String prating) {
		this.prating = prating;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int pprice, String prating, Address address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.prating = prating;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", prating=" + prating + ", address="
				+ address + "]";
	}
}
