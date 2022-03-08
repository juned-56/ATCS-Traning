package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ptable")
public class Product {
	@Id
	private int pid;
	@Column(length = 15)
	private String pname;
	private int pprice;
	@Column(length = 15)
	private String padd;
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
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int pprice, String padd) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.padd = padd;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", padd=" + padd + "]";
	}
	
}
