package com.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {
	@Id
	@Column(length= 15)
	@GeneratedValue
	private int pId;
	@Column(length= 15)
	private String pName;
	@Column(length= 15)
	private int pPrice;
	@Column(length= 15)
	private String pAddress;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pId, String pName, int pPrice, String pAddress) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pAddress = pAddress;
	}
	
}
