package com.tcs.entity;

public class User {
	private String name;
	private Long mobileNumber;
	private byte age;
	
//custom constructor
	public User(String name, Long mobileNumber, byte age) {
		this(name, mobileNumber);
		this.age = age; 
	}
//overloaded constructor
	public User(String name, Long mobileNumber) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
	}

	public void workout() {
		System.out.println(name + " is working out");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", mobileNumber=" + mobileNumber + ", age=" + age + "]";
	}

}
