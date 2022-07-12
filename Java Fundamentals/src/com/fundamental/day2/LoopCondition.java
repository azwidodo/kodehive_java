package com.fundamental.day2;

public class LoopCondition {

	public static void main(String[] args) {
		
		int noAntrian = 1;
		
		do {
			if (noAntrian < 3) {
				System.out.println(noAntrian + " Dapat hadiah");
			} else {
				System.out.println(noAntrian + " Tidak dapat hadiah");
			}
			
			noAntrian ++;
			
		} while (noAntrian < 6);
		
		
	}

}
