package com.tcs.set.examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String[] args) {
//		demo1();
		treeSetDemo();

	}

	private static Set<User> treeSetDemo() {
		Set<User> users = new TreeSet<User>();// sorted order
		for (int i = 0; i < 30; i++) {
			User user = new User();
			user.setAge(10 + i);
			users.add(user);
		}
		System.out.println(users);
		return users;

	}

	private static void demo1() {
		Set<User> users = createSet();
		System.out.println(users);
		User userWithSameAge = new User();
		userWithSameAge.setAge(10);
		users.add(userWithSameAge);
		System.out.println(users);
	}

	private static Set<User> createSet() {
		Set<User> users = new HashSet<User>();
		for (int i = 0; i < 20; i++) {
			User user = new User();
			user.setAge(10 + i);
			users.add(user);
		}
		return users;
	}

}
