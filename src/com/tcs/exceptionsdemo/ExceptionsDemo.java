package com.tcs.exceptionsdemo;

public class ExceptionsDemo {
	
public static void main(String[] args)throws MyCheckedException {
		try {
			demo2();
		}catch(InvalidInputException e){
			
		}catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("always called");
		}
	}
	public static void demo2() throws MyCheckedException, InvalidInputException{
		throw new MyCheckedException();
	}
	public static void demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			System.out.println("division by zero not allowed");
		}
	}
}
