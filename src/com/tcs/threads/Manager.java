package com.tcs.threads;

public class Manager {
	public static void main(String[] args) {
		Worker worker1 = new Worker();
		Thread t1 = new Thread(worker1);
		t1.start();
	}
}
