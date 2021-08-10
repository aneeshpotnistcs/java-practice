package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(bank.instanceVariable);

		Bank bank1 = new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(bank1.instanceVariable);

	}

}

class Bank{
	static int counter;//static variable
	int instanceVariable=10;//instance variable
	
	public static int createNewAccountNumber() {
		return ++counter;
	}
}