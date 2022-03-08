package com.jpqlex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stuudentjpql")
public class Student {
    @Id
	private int sid;
    @Column(length=15)
	private String sname;
	private int smarks;
	@Column(length=15)
	private String sadd;
	@Column(length = 15)
	private String course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int smarks, String sadd, String course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sadd = sadd;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sadd=" + sadd + ", course="
				+ course + "]";
	}
	
}
