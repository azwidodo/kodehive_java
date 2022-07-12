package com.fundamental.day4;

public class Encapsulation {

	private String nama;
	private int usia;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getUsia() {
		return usia;
	}
	public void setUsia(int usia) {
		this.usia = usia;
	}
	
	public static void main(String[] args) {
		Encapsulation enc = new Encapsulation();
		
		enc.setNama("Java");
		enc.setUsia(12);
		
		System.out.println(enc.getNama());
		System.out.println(enc.getUsia());
	}
}
