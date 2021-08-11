package com.tcs.exceptionsdemo.unchecked;

public class OverAgeException extends IllegalArgumentException {
	public OverAgeException(String message) {
		super(message);
	}
}
