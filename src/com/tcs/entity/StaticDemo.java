package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank.createNewAccountNumber();
		Bank.createNewAccountNumber();
	}

}

class Bank{
	static int counter;
	
	public static int createNewAccountNumber() {
		return ++counter;
	}
}