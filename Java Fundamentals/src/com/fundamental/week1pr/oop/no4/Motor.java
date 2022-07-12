package com.fundamental.week1pr.oop.no4;

public class Motor {
	
	public static void main(String[] args) {
		Motor motor = new Motor();
		
		motor.spesifikasi();
	}

	// Motor memiliki hubungan HAS-A dengan Bengkel
	public void spesifikasi() {
		
		Bengkel spek = new Bengkel();
		
		spek.blokSilinder();
		spek.porosEngkol();
	}
}
