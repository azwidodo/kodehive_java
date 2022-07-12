package com.fundamental.day4;

public class Method {
	
	public void procedural() {
		int deret = 20;
		System.out.println(deret);
	}
	
	public int angka() {
		System.out.println("Hello");
		return 80;
	}
	
	public static void main(String[] args) {
		
		Method meth = new Method();
		
		int b = meth.angka();
		
		System.out.println(b * 20);
	}

}
