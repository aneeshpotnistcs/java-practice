package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
//		createHashMap();
//		createHashMapWithOtherScores();
		treeMap();
	}

	private static void treeMap() {
		Map<Integer, Float> mathScores = new TreeMap<Integer, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put(i, (float) (100 * Math.random()));
		}
		System.out.println(mathScores);
	}

	private static void createHashMapWithOtherScores() {
		Map<String, Student> allScores = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			allScores.put("student"+i,
					new Student((float)(100*Math.random()),
						(float)(100*Math.random()),
						(float)(100*Math.random())));
		}
		System.out.println(allScores);

	}

	private static void createHashMap() {
		Map<String, Float> mathScores = new HashMap<String, Float>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("student" + i, (float) (100 * Math.random()));
		}
		boolean exists = mathScores.containsKey("student1");
		System.out.println(exists);
//		mathScores.containsValue(value);
		mathScores.put("student1", 34F);
		mathScores.remove("student1");
		System.out.println(mathScores);
	}
	
	
}
