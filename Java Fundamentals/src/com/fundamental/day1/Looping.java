package com.fundamental.day1;

public class Looping {

	public static void main(String[] args) {
		
		// while loop
		int i = 5;
		System.out.println("While loop starts");
		
		while (i < 5) {
			System.out.println(i);
			i ++;
		}
		
		// do while loop
		i = 5;
		System.out.println("Do while loop starts");
		
		do {
			System.out.println(i);
			i ++;
		} while (i < 5);
		
		// for loop
		System.out.println("For loop starts");
		
		for (int j = 0; j < 5; j++) {
			System.out.println("Hello");
		}

	}

}
