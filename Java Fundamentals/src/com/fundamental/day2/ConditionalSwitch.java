package com.fundamental.day2;

public class ConditionalSwitch {

	public static void main(String[] args) {
		
		int month = 12;
		int day = 2;
		
		switch (month) {
		case 1:
			System.out.println("It is January.");
			
			switch (day) {
			case 1:
				System.out.println("Happy New Year's");
				break;
			default:
				break;
			}
			
			break;
			
		case 12:
			System.out.println("It is December.");
			
			switch (day) {
			case 25:
				System.out.println("Happy Christmas");
				break;
			default:
				break;
			}
			
			break;

		default:
			System.out.println("No special day or month");
			break;
		}

	}

}
