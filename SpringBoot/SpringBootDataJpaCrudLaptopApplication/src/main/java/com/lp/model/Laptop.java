package com.lp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_info")
public class Laptop {
	@Id
	@Column(name = "lid", length = 20)
	private int lapId;
	@Column(name = "lname", length = 20)
	private String lapName;
	@Column(name = "lmodel", length = 20)
	private String lapModel;
	@Column(name = "lprice", length = 20)
	private int lapPrice;
	@Column(name = "lsrno", length = 20)
	private String lapSerialNo;
	@Column(name = "lram", length = 20)
	private int lapRam;
	@Column(name = "lrom", length = 20)
	private int lapRom;
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	public String getLapName() {
		return lapName;
	}
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	public String getLapModel() {
		return lapModel;
	}
	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}
	public int getLapPrice() {
		return lapPrice;
	}
	public void setLapPrice(int lapPrice) {
		this.lapPrice = lapPrice;
	}
	public String getLapSerialNo() {
		return lapSerialNo;
	}
	public void setLapSerialNo(String lapSerialNo) {
		this.lapSerialNo = lapSerialNo;
	}
	public int getLapRam() {
		return lapRam;
	}
	public void setLapRam(int lapRam) {
		this.lapRam = lapRam;
	}
	public int getLapRom() {
		return lapRom;
	}
	public void setLapRom(int lapRom) {
		this.lapRom = lapRom;
	}
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lapId, String lapName, String lapModel, int lapPrice, String lapSerialNo, int lapRam,
			int lapRom) {
		super();
		this.lapId = lapId;
		this.lapName = lapName;
		this.lapModel = lapModel;
		this.lapPrice = lapPrice;
		this.lapSerialNo = lapSerialNo;
		this.lapRam = lapRam;
		this.lapRom = lapRom;
	}
	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapName=" + lapName + ", lapModel=" + lapModel + ", lapPrice=" + lapPrice
				+ ", lapSerialNo=" + lapSerialNo + ", lapRam=" + lapRam + ", lapRom=" + lapRom + "]";
	}
	
}
