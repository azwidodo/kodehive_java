package com.fundamental.day1;

import java.util.Random;
import java.util.Scanner;

public class RandomProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===============");
		System.out.println("Random Program");
		System.out.println("===============");
		
		System.out.print("Jumlah Baris: ");
		Integer jumlahBaris = scan.nextInt();
		
		System.out.print("Jumlah Kolom: ");
		Integer jumlahKolom = scan.nextInt();
		
		System.out.print("Nilai Maksimum: ");
		Integer nilaiMaks = scan.nextInt();
		
		scan.close();
		
		System.out.println("===============");
		System.out.println("Terima kasih telah mengisi data.");
		System.out.println("===============");
		
		Random random = new Random();
		
		for (int i = 0; i < jumlahBaris; i++) {
			
			StringBuilder kolom = new StringBuilder("");
	        
	        for (int j = 0; j < jumlahKolom; j++) {
	        	kolom.append(String.format("%7d", random.nextInt(nilaiMaks) + 1));
	        }
	        
	        System.out.println(kolom);
	    }
	}

}
