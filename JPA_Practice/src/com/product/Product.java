package com.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "pro")
public class Product {
	@Id
	private int pid;
	private String pname;
	private int pprice;
	private int pincode;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int pprice, int pincode) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pincode=" + pincode + "]";
	}
	
}
