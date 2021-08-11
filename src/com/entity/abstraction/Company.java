package com.entity.abstraction;

public class Company {
	public static void main(String[] args) {
		IStaff staff = new HR();
		staff.work();
		IStaff staff1 = new Guard();
		staff1.work();
	}
}
