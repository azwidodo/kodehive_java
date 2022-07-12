package com.fundamental.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Collection<String> collect = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			collect.add("content " + i);
		}
		
		List<Collection<String>> data = new ArrayList<>();
		data.add(collect);
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
	}

}
