package com.market.member;

public class person {
	//클래스 변수
private String name;
private int phone;
private String address;
//클래스의 생성자들
public person(String name) {
	this.name =name;
}

public person(String name, int phone) {
	this.name =name;
	this.phone = phone;
}

public person(String name, int phone,String address) {
	this.name =name;
	this.phone = phone;
	this.address = address;	
}

//Getter 메서드들
public String getName() {return this.name;}
public int getPhone() {return this.phone;}
public String getAddress() {return this.address;}
//Setter 메서드들
public void setName(String name) {this.name=name;}
public void setPhone(int phone) {this.phone=phone;}
public void setAddress(String address) {this.address =address;}
}
