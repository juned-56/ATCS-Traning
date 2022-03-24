package com.pz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springbootpizza")
public class Pizza {
	@Id
	@Column(name = "pid", length = 15)
	private int pzId;
	@Column(name = "ptype", length = 15)
	private String pzType;
	@Column(name = "pprice", length = 15)
	private int pzPrice;
	@Column(name = "padd", length = 15)
	private String pzAdd;
	public int getPzId() {
		return pzId;
	}
	public void setPzId(int pzId) {
		this.pzId = pzId;
	}
	public String getPzType() {
		return pzType;
	}
	public void setPzType(String pzType) {
		this.pzType = pzType;
	}
	public int getPzPrice() {
		return pzPrice;
	}
	public void setPzPrice(int pzPrice) {
		this.pzPrice = pzPrice;
	}
	public String getPzAdd() {
		return pzAdd;
	}
	public void setPzAdd(String pzAdd) {
		this.pzAdd = pzAdd;
	}
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public Pizza(int pzId, String pzType, int pzPrice, String pzAdd) {
		super();
		this.pzId = pzId;
		this.pzType = pzType;
		this.pzPrice = pzPrice;
		this.pzAdd = pzAdd;
	}
	@Override
	public String toString() {
		return "Pizza [pzId=" + pzId + ", pzType=" + pzType + ", pzPrice=" + pzPrice + ", pzAdd=" + pzAdd + "]";
	}
	
}
