package com.fundamental.day3.oop;

public class ParentWithConstructor {
	
	String nama;
	int usia;
	
	// constructor bisa dibuat berkali2 dengan overloading
	public ParentWithConstructor(String name, int age) {
		System.out.println("Parent object is created.");
		
		this.nama = name;
		this.usia = age;
	}
	
	public void printParent() {
		System.out.printf("Nama: %s \nUsia: %s", nama, usia);
	}

	public static void main(String[] args) {
		
		ParentWithConstructor obj = new ParentWithConstructor("Java", 2022);
		
		obj.printParent();
	
	}

}
