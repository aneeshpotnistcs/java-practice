package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
	}

}

class Bank{
	static int counter;
	
	public static int createNewAccountNumber() {
		return ++counter;
	}
}