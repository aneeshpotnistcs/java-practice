package com.tcs.exceptionsdemo.unchecked;

//public class MyUncheckedException extends RuntimeException {
public class UnderAgeException extends IllegalArgumentException {

	public UnderAgeException(String message) {
		super(message);
	}
}
