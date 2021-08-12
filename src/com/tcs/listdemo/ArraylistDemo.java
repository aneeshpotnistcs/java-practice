package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println("after sorting=" + numbers);
		
	}

	private static List<Integer> createList() {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();//Generics
		numbers.add(1);//autoboxing else we would have to write numbers.add(new Integer(1))
//		numbers.add("Ram");//string is not allowed
		System.out.println(numbers.get(0));
		
		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
		
	}
}
