package com.market.member;
public class Admin extends person {
	private String id ="admin";
	private String password = "admin1234";
	
	public Admin(String name,int phone) {
		super(name,phone);
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
}