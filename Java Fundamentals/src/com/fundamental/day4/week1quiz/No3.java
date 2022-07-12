package com.fundamental.day4.week1quiz;

public class No3 {

	public static void main(String[] args) {
		
		int ukuranDeret = 16;
		int angka = 2;
		
		while (ukuranDeret > 0) {
			
			for (int i = 0; i < angka - 1; i++) {
				
				if (ukuranDeret > 0) {
					System.out.print(angka + " ");
				}
				
				ukuranDeret--;
			}
			
			angka += 2;
		}

	}

}
