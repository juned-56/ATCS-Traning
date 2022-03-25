package com.cr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springbootcar")
public class Car {
	@Id
	@Column(name = "cid", length = 15)
	private int crId;
	@Column(name = "cname", length = 15)
	private String crName;
	@Column(name = "cprice", length = 15)
	private int crPrice;
	@Column(name = "crmodel", length = 15)
	private String crModel;
	public int getCrId() {
		return crId;
	}
	public void setCrId(int crId) {
		this.crId = crId;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public int getCrPrice() {
		return crPrice;
	}
	public void setCrPrice(int crPrice) {
		this.crPrice = crPrice;
	}
	public String getCrModel() {
		return crModel;
	}
	public void setCrModel(String crModel) {
		this.crModel = crModel;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int crId, String crName, int crPrice, String crModel) {
		super();
		this.crId = crId;
		this.crName = crName;
		this.crPrice = crPrice;
		this.crModel = crModel;
	}
	@Override
	public String toString() {
		return "Car [crId=" + crId + ", crName=" + crName + ", crPrice=" + crPrice + ", crModel=" + crModel + "]";
	}
	
}
