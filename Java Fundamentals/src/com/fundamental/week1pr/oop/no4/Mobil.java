package com.fundamental.week1pr.oop.no4;

public class Mobil {
	
	public static void main(String[] args) {
		Mobil mobil = new Mobil();
		
		mobil.spesifikasi();
	}

	// Mobil memiliki hubungan HAS-A dengan Bengkel
	public void spesifikasi() {
		
		Bengkel spek = new Bengkel();
		
		spek.silinderHead();
		spek.ringPiston();
	}
}
