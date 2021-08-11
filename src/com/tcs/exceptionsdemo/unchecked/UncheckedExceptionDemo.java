package com.tcs.exceptionsdemo.unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.work();
	}
}

class User {
	int age = 61;

	public void work() {
		if (age <= 18) {
			throw new UnderAgeException("No child labour");
//			System.out.println("unreachable code");
		}else if(age>60){
			throw new OverAgeException("Age greater than 60");
		}
	}
}
