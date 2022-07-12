package com.fundamental.day3;

import java.util.ArrayList;

public class ArrayQuiz {

	public static void main(String[] args) {
		
		// nomor 1
		int sum = 0;
	    
	    int[] arr = new int[5];

	    arr[0] = 9;
	    arr[1] = 5;
	    arr[2] = 6;
	    arr[3] = 10;
	    arr[4] = 80;

	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    System.out.println(sum);
	    
	    // nomor 2
	    int dimensi = 4;
	    
	    int [][] arr2 = new int [dimensi][dimensi];
	    
	    for (int i = 0; i < dimensi; i++) {
	        for (int j = 0; j < dimensi; j++) {
	            System.out.print(dimensi);
	        }
	        System.out.println("");
	    }
	    
	    // nomor 3
	    int x = 2;
	    
	    int[][] array = new int[x][x];
	    
	    String teks = "o";
	    
	    if (x == 2) {
	        teks = "x";
	    }
	    
	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < x; j++) {
	            System.out.print(teks);
	        }
	        System.out.println();
	    }
	    
	    // nomor 4
	    ArrayList<Double> a = new ArrayList<>();
	    
	    a.add(5.80);
	    a.add(5.20);
	    a.add(3.99);
	    
	    for (double item : a) {
	        System.out.println(item);
	    }

	}

}
