package exceptionsdemo;

public class ExceptionsDemo {
	
public static void main(String[] args)throws MyCheckedException {
		demo2();
	}
	public static void demo2() throws MyCheckedException{
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
