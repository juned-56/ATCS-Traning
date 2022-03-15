package SpringCoreAutoWireAtc.com.springcore3;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int hNo;
	private String city;
	private String state;
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int hNo, String city, String state) {
		super();
		this.hNo = hNo;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + ", state=" + state + "]";
	}
	
}
