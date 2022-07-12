package com.fundamental.day3.oop;

public class Parent {
	
	String nama;
	int usia;
	
	public void printParent() {
		System.out.printf("Nama: %s \nUsia: %s", nama, usia);
	}
	
	public static void main(String[] args) {
		Parent objParent = new Parent();
		
		objParent.nama = "Java";
		objParent.usia = 22;
		
		objParent.printParent();
	}

}
