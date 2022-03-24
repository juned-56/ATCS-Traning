package com.fo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "springbootdatajpafood")
public class Food {
	@Id
	@Column(name = "fid", length = 15)
	private int fooId;
	@Column(name = "ftye", length = 15)
	private String fooType;
	@Column(name = "fadd", length = 15)
	private String fooAdd;
	@Column(name = "fprice", length = 15)
	private int fooprice;
	public int getFooId() {
		return fooId;
	}
	public void setFooId(int fooId) {
		this.fooId = fooId;
	}
	public String getFooType() {
		return fooType;
	}
	public void setFooType(String fooType) {
		this.fooType = fooType;
	}
	public String getFooAdd() {
		return fooAdd;
	}
	public void setFooAdd(String fooAdd) {
		this.fooAdd = fooAdd;
	}
	public int getFooprice() {
		return fooprice;
	}
	public void setFooprice(int fooprice) {
		this.fooprice = fooprice;
	}
	public Food() {
		// TODO Auto-generated constructor stub
	}
	public Food(int fooId, String fooType, String fooAdd, int fooprice) {
		super();
		this.fooId = fooId;
		this.fooType = fooType;
		this.fooAdd = fooAdd;
		this.fooprice = fooprice;
	}
	@Override
	public String toString() {
		return "Food [fooId=" + fooId + ", fooType=" + fooType + ", fooAdd=" + fooAdd + ", fooprice=" + fooprice + "]";
	}
	
}