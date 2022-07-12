package com.fundamental.day4.week1quiz;

public class No4 {

	public static void main(String[] args) {
		
		int b = 2;
		int c = 1;
		String operator = "+";

		java.util.ArrayList<Double> a = new java.util.ArrayList<Double>();
	    
	    a.add(5.80);
	    a.add(5.20);
	    a.add(3.99);
	    
	    double result;
	    
	    if (operator.equals("+")) {
	        result = a.get(b) + a.get(c);
	    } else {
	        result = a.get(b) - a.get(c);
	    }
	    
	    System.out.printf("%s %s %s = %s", a.get(b), operator, a.get(c), result);

	}

}
