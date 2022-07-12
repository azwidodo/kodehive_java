package com.fundamental.day1;

import java.util.Scanner;

public class ProgramPenggandaUlang {

	public static void main(String[] args) {
		
		System.out.println("=========================");
		System.out.println("Program Penggandaan Ulang");
		System.out.println("=========================");
		
		Scanner scan = new Scanner(System.in);
		
		String typing = "";
		
		int uang = 10000;
		
		while (!typing.equals("cukup")) {
			System.out.println("Jumlah uang Anda sekarang: " + uang);
			System.out.println("Ketik 'cukup' untuk berhenti, ketik apapun untuk menggandakan lagi.");
			
			typing = scan.nextLine();
			uang *= 2;
		}
			
		System.out.println("Program penggandaan selesai...");
		
		scan.close();
	}

}
