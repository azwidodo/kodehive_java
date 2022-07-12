package com.fundamental.day2;

public class Array {

	public static void main(String[] args) {
		
		String[] buahArray = {"jeruk", "apel", "semangka"};
	
		for (int i = 0; i < buahArray.length; i++) {
			System.out.println(buahArray[i].toUpperCase());
		}
		
		for (String buah : buahArray) {
			System.out.println(buah);
		}
		
		Object[] info = {"Hello", 10, 100.0f};
		
		for (Object item : info) {
			System.out.println(item + ": " + item.getClass());
		}
	}

}
