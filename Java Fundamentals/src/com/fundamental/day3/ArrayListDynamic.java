package com.fundamental.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDynamic {

	public static void main(String[] args) {
		
		ArrayList<String> buah = new ArrayList<>();
		
		buah.add("Jeruk");
		buah.add("Semangka");
		buah.add("Semangka");
		buah.add("Jeruk");

		System.out.println(buah);
		
		for (int i = 0; i < buah.size(); i++) {
			System.out.println(buah.get(i));
		}
		
		buah.set(1, "Apel");
		buah.remove("Jeruk"); // only removes the first of this item
		
		System.out.println(buah);
		
		// List: bisa pake .add .remove .size .get .set
		List<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(9);
	
		integerList.set(0, 11);

		// Collection: bisa pake .add .remove .size
		Collection<Double> doubleCollection = new ArrayList<>();
		doubleCollection.add(23.08);
		doubleCollection.add(14.08);
		
		System.out.println(doubleCollection);
		
		for (Double item : doubleCollection) {
			System.out.println(item);
		}
		
	}

}
