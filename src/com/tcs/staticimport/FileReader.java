package com.tcs.staticimport;

//import static java.util.Arrays.*;

import java.util.Arrays;

public class FileReader {
public static void main(String[] args) {
	int[] numbers = {4,5,6,7,9};
//	sort(numbers); //works with static import
	Arrays.sort(numbers);//works without static import
}
}
