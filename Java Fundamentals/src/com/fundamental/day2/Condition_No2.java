package com.fundamental.day2;

public class Condition_No2 {

	public static void main(String[] args) {

		int loop = 16;
		
		for (int i = 0; i < loop; i++) {
			
			String teks = "";
			
			if (loop % 2 == 0) {
				teks = "GENAP";
			} else {
				teks = "GANJIL";
			}
			
			if (loop <= 10) {
				teks = teks.toLowerCase();
			}
			
			if ((i + 1) % 5 == 0) {
				teks = teks + "!";
			}
			
			System.out.println(teks);

		}
	}

}
