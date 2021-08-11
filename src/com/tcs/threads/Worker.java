package com.tcs.threads;

public class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(99999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
