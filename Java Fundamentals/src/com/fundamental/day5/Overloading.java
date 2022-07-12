package com.fundamental.day5;


public class Overloading {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		System.out.println(tambah(a, b));
		
		double c = 5;
		double d = 10;
		
		System.out.println(tambah(c, d));
		
		double e = 14;
		
		System.out.println(tambah(e));

	}
	
	public static int tambah(int a, int b) {
		System.out.println("Tambah data integer");
		return a + b;
	}
	
	public static double tambah(double a, double b) {
		System.out.println("Tambah data float");
		return a + b;
	}
	
	public static double tambah(double a) {
		System.out.println("Tambah dengan 13");
		return 10 + a;
	}
	

}
