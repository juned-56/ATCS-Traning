package com.spring.ex;

public class Address {
	private String city;
	private String state;
	private String dist;
	private String country;
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
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, String dist, String country) {
		super();
		this.city = city;
		this.state = state;
		this.dist = dist;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", dist=" + dist + ", country=" + country + "]";
	}
	
}
