package com.fundamental.day2;

import java.util.Scanner;

public class ConditionProgram {

	public static void main(String[] args) {
		
		System.out.println("====================");
		System.out.println("Selamat datang di Kodehive Academy");
		System.out.println("====================");
		
		Scanner scan = new Scanner(System.in);
		
		String typing = "";
		String nama = "";
		
		while (!typing.equals("3")) {
			System.out.println("");
			System.out.println("");
			
			System.out.println("--------------------");
			System.out.println("Silakan pilih menu dengan memasukkan nomornya:");
			System.out.println("1. Masukkan / ubah nama Anda");
			System.out.println("2. Tampilkan nama Anda");
			System.out.println("3. Keluar program");
			System.out.print("Silakan masukkan pilihan: ");
			typing = scan.nextLine();
			
			System.out.println("");
			
			if (typing.equals("1")) {
				System.out.print("Masukkan nama Anda: ");
				nama = scan.nextLine();
				System.out.println("Nama Anda sudah tersimpan sebagai: " + nama);
				System.out.print("Ketik apapun untuk lanjut...");
				
				typing = scan.nextLine();
				typing = "";
				System.out.println("--------------------");
			} else if (typing.equals("2")) {
				if (nama.equals("")) {
					System.out.println("Anda belum memasukkan nama, masukkan nama terlebih dahulu.");
					System.out.print("Ketik apapun untuk lanjut...");
					
					typing = scan.nextLine();
					typing = "";
					System.out.println("--------------------");
				} else {
					System.out.println("Nama Anda adalah: " + nama);
					System.out.print("Ketik apapun untuk lanjut...");
					
					typing = scan.nextLine();
					typing = "";
					System.out.println("--------------------");
				}
			} else if (typing.equals("3")) {
				break;
			} else {
				System.out.println("Pilihan menu tidak tersedia.");
				System.out.print("Ketik apapun untuk lanjut...");
				
				typing = scan.nextLine();
				typing = "";
				System.out.println("--------------------");
			}
		}
		
		System.out.println("--------------------");
		System.out.println("Terima kasih telah menggunakan program kami.");
		scan.close();
	}

}
