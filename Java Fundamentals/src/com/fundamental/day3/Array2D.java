package com.fundamental.day3;


public class Array2D {

	public static void main(String[] args) {
		
		int baris = 3;
		int kolom = 2;
		
		String[][] buah = new String[baris][kolom];
		
		buah[0][0] = "Semangka";
		buah[0][1] = "1";
		buah[1][0] = "Jeruk";
		buah[1][1] = "2";
		buah[2][0] = "Apel";
		buah[2][1] = "3";
		
		System.out.println(buah);
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(buah[i][j] + " ");
			}
			
			System.out.println("");
		}
	}

}
