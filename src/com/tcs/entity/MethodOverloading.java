package com.tcs.entity;

public class MethodOverloading {
	public static void main(String[] args) {
		User1 user1 = new Employee1();
		user1.work();
		user1.work(4);
		user1.work("4");
	}
}

class User1 {// super class
	protected void work() {

		System.out.println("user is working");
	}

	public void work(int duration) {
		System.out.println("user is working for " + duration + " hours");
	}

	public void work(String duration) {
		System.out.println("user is working for " + duration + " hours");
	}
}

class Employee1 extends User1 {// sub class
	@Override
	public void work() {
		super.work();
		System.out.println("Employee is working");
	}
}