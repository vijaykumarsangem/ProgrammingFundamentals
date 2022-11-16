package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test {

	public static void main(String[] args) {

		// declare an empty integer array of length = 4
		// iterate of the array and print the value to console
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i + " : " + arr[i]);

		// fill it with the number `3`
		// print the array to the console
		int[] array = new int[4];
		Arrays.fill(array, 3);
		for (int i = 0; i < array.length; i++)
			System.out.println("Element at index " + i + " : " + array[i]);

		// declare an empty integer array of length = 7
		// fill it with the number `2`
		// reassign the second value in the array to the number `23`
		// print the array to the console
		int[] array1 = new int[7];
		Arrays.fill(array1, 2);
		Arrays.fill(array1, 1, 2, 23);
		for (int i = 0; i < array1.length; i++)
			System.out.println("Element at index " + i + " : " + array1[i]);

		// create an integer variable
		// create a second integer variable
		// create an `if` statement which compares the two variables and prints to the
		// console if they are equal
		int i1 = 10;
		int i2 = 11;
		if (i1 == i2) {
			System.out.println("both values are equal");
		} else {
			System.out.println("both values are not equal");

		}

		// create a string variable
	    // create a second string variable which has the same value as the first
	    // create an `if` statement which compares the two variables and prints to the console if they are equal
		String s1="ajay";
		String s2="Ajay";
		if (Objects.equals(s1, s2)) {
			System.out.println("both Strings are equal");
		} else {
			System.out.println("both Strings are not equal");
		}
		// create an `if` statement which compares the two variables and prints to the console if they are equal ignoring case
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("both Strings are equal");
		} else {
			System.out.println("both Strings are not equal");

		}
	
//	    Write a method that finds the longest string in any given array.
//	    sample data to call the method with
//	    i.e. [] -> ""
//	    i.e. ["cat", "dog", "lion", "tiger"] -> lion and tiger
//	    i.e. ["word", "count", "diamond", "blue", "green"] -> diamond
//	    i.e. ["board", "jack", "java", "oop", "spring"] -> board
		
		String longestStr = null;
		int lengthofLongestStr = 0;
		int indexPosition = 0;
		List<String> names = Arrays.asList("word", "count", "diamond", "blue", "green");
		lengthofLongestStr = names.get(0).length();
		for (int index = 1; index < names.size(); index++) {
			if (names.get(index).length() > lengthofLongestStr) {
				lengthofLongestStr = names.get(index).length();
				indexPosition = index;
			}
		}
		longestStr = names.get(indexPosition);
		System.out.println("Longest String is " + longestStr);
	}

}
