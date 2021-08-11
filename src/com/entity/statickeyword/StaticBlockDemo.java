package com.entity.statickeyword;

public class StaticBlockDemo {
	
	private static int age=10;
	int price=20;//cannot be accessed/referred inside static block/method
	public StaticBlockDemo() {
		System.out.println("In constructor");
	}
	static {//called first loaded during startup
		final int localVariable = 10;
		System.out.println("This is static block"+age);
	}
	public static void main(String[] args) {
//		StaticBlockDemo blockDemo = new StaticBlockDemo();
//		new StaticBlockDemo();
	}
	
	void work() {
		int time = 45;
	}

}
