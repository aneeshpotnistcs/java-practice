package com.tcs.entity;

public class StringbufferDemo {
	public static void main(String[] args) {
		String literal = "TCS";//stringpool
		String newKeyword = new String("TCS");//heap, immutable
		StringBuilder strBuilder = new StringBuilder("TCS");//heap, mutable, not thread-safe
		StringBuffer strBuffer = new StringBuffer("TCS");//heap, mutable, thread-safe
	}
}
