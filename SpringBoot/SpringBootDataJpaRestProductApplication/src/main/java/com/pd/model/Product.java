package com.pd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springbootproduct")
public class Product {
	@Id
	@Column(name = "pid", length = 15)
	private int prId;
	@Column(name = "pname", length = 15)
	private String prName;
	@Column(name = "pprice", length = 15)
	private int prPrice;
	@Column(name = "psale", length = 15)
	private int prSale;
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public int getPrPrice() {
		return prPrice;
	}
	public void setPrPrice(int prPrice) {
		this.prPrice = prPrice;
	}
	public int getPrSale() {
		return prSale;
	}
	public void setPrSale(int prSale) {
		this.prSale = prSale;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int prId, String prName, int prPrice, int prSale) {
		super();
		this.prId = prId;
		this.prName = prName;
		this.prPrice = prPrice;
		this.prSale = prSale;
	}
	@Override
	public String toString() {
		return "Product [prId=" + prId + ", prName=" + prName + ", prPrice=" + prPrice + ", prSale=" + prSale + "]";
	}
	
	
	
}
