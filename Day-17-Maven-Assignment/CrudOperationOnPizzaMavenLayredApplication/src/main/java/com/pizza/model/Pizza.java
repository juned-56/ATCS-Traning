package com.pizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza_info")
public class Pizza {
	@Id
	@GeneratedValue
	@Column(length = 15)
	private int pId;
	@Column(length = 15)
	private String pType;
	@Column(length = 15)
	private String pAdd;
	@Column(length = 15)
	private int pPrice;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpAdd() {
		return pAdd;
	}
	public void setpAdd(String pAdd) {
		this.pAdd = pAdd;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public Pizza(int pId, String pType, String pAdd, int pPrice) {
		super();
		this.pId = pId;
		this.pType = pType;
		this.pAdd = pAdd;
		this.pPrice = pPrice;
	}
	
}
