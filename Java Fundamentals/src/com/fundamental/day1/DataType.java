package com.fundamental.day1;

public class DataType {
	
	public static void main(String[] args) {
		
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		
		Long dataLong = 9000000l;
		
		int number1 = 900000;
		int number2 = 900000;
		
		long sum1and2 = Long.valueOf(number1);
		
		String company = "kodehive";
		
//		System.out.printf("%10s", company);
		
		StringBuffer greet = new StringBuffer("Selamat siang");
		System.out.println(greet.append(" semua"));
		System.out.println(greet.charAt(2));
		
		// substring
		System.out.println(greet.substring(1, 5));
		
		// array with length 2
		String[] exampleArray = new String[2];
		exampleArray[0] = "Hello";
		exampleArray[1] = "World";
	}

}
