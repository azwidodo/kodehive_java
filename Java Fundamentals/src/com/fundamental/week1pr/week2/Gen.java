package com.fundamental.week1pr.week2;

public class Gen<N> {

	N obj;
	
	Gen(N input) {
		obj = input;
	}
	
	N getGen() {
		return obj;
	}
	
	public static class Innergen {
		public static void main(String[] args) {
			Gen<String> test = new Gen<String>("input");
			System.out.println(test.getGen());
		}
	}
}
