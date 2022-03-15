package SpringCoreAutoWireAtc.com.springcore3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {
	private int sRn;
	private String sName;
	private int sMarks;
	private int sClass;
	Address address;
	public int getsRn() {
		return sRn;
	}
	public void setsRn(int sRn) {
		this.sRn = sRn;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsMarks() {
		return sMarks;
	}
	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}
	public int getsClass() {
		return sClass;
	}
	public void setsClass(int sClass) {
		this.sClass = sClass;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sRn, String sName, int sMarks, int sClass, Address address) {
		super();
		this.sRn = sRn;
		this.sName = sName;
		this.sMarks = sMarks;
		this.sClass = sClass;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sRn=" + sRn + ", sName=" + sName + ", sMarks=" + sMarks + ", sClass=" + sClass + ", address="
				+ address + "]";
	}
	
}
