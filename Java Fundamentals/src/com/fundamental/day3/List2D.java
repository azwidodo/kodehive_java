package com.fundamental.day3;

import java.util.ArrayList;
import java.util.List;

public class List2D {

	public static void main(String[] args) {
		
		List<List<String>> makanan = new ArrayList<>();
		
		List<String> buah = new ArrayList<>();
		List<String> sayuran = new ArrayList<>();
		
		buah.add("Jeruk");
		buah.add("Apel");
		
		sayuran.add("Bayam");
		sayuran.add("Tomat");
		
		makanan.add(buah);
		makanan.set(0, sayuran);
		
		System.out.println(makanan);
		System.out.println(makanan.get(0));
		System.out.println(makanan.get(0).get(0));
		
	}

}
