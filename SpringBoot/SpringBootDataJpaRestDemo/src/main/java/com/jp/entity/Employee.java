package com.jp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "sbdataemp")
public class Employee {
	@Id
	@Column(name = "eid", length = 10)
	private int empId;
	@Column(name = "ename", length = 15)
	private String empName;
	@Column(name = "esal", length = 10)
	private int empSal;
	@Column(name = "eadd", length = 20)
	private String empAdd;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}
	
}
