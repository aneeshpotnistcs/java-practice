package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
//		sortList(numbers);
//		filterList(numbers);
//		add(numbers);
		otherOps(numbers);

	}

	private static void otherOps(List<Integer> numbers) {
		System.out.println(numbers);
//		numbers.remove(11);
		numbers.add(50);//adds at the end
		numbers.add(0,50);//add at specific index
		System.out.println(numbers);


	}

	private static void add(List<Integer> numbers) {
		Optional<Integer> sum1 = numbers.stream().reduce((Integer sum, Integer number) -> {
			System.out.println(sum + ", " + number);
			return sum + number;
		});
		System.out.println(sum1.get());
	}

	/**
	 * 
	 * Method to filter the elements
	 * 
	 * @param numbers
	 */
	private static void filterList(List<Integer> numbers) {
		numbers.forEach((number) -> {
			System.out.println(number % 2 == 0);
		});
		List<Integer> filtered = numbers.stream().filter((number) -> number % 2 == 0).collect(Collectors.toList());
		System.out.println(filtered);
	}

	private static void sortList(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		System.out.println("after sorting=" + numbers);
	}

	private static List<Integer> createList() {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();// Generics
		numbers.add(1);// autoboxing else we would have to write numbers.add(new Integer(1))
//		numbers.add("Ram");//string is not allowed
		System.out.println(numbers.get(0));

		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;

	}
}
