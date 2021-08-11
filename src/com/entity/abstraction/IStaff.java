package com.entity.abstraction;

public abstract class IStaff {
	private String name;

	public void fillTimesheet() {
		System.out.println(name + "has filled timesheet");
	}

	public abstract void work();

}

class HR extends IStaff {
	@Override
	public void work() {
		System.out.println("HR is working");
	}

}

class Guard extends IStaff {
	public void work() {
		System.out.println("Guard is working");

	}

}
