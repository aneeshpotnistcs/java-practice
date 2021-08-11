package com.tcs.threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
}
