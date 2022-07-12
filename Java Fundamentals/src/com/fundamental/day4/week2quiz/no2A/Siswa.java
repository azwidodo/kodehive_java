package com.fundamental.day4.week2quiz.no2A;

public class Siswa {

	String nama;
	String npm;
	int mtk;
	int indo;
	int pbo;
	
	private String getNama() {
		return nama;
	}
	private void setNama(String nama) {
		this.nama = nama;
	}
	private String getNpm() {
		return npm;
	}
	private void setNpm(String npm) {
		this.npm = npm;
	}
	private int getMtk() {
		return mtk;
	}
	private void setMtk(int mtk) {
		this.mtk = mtk;
	}
	private int getIndo() {
		return indo;
	}
	private void setIndo(int indo) {
		this.indo = indo;
	}
	private int getPbo() {
		return pbo;
	}
	private void setPbo(int pbo) {
		this.pbo = pbo;
	}
	
	private int getRata() {
		return Integer.valueOf(getMtk() + getIndo() + getPbo()) / 3;
	}
	
	private void cetakData() {
		System.out.printf("Nama: %s\n", getNama());
		System.out.printf("NPM/NIM: %s\n", getNpm());
		System.out.printf("Nilai Matematika: %s\n", getMtk());
		System.out.printf("Nilai B Indonesia: %s\n", getIndo());
		System.out.printf("Nilai PBO: %s\n", getPbo());
		System.out.printf("Nilai Rata-rata: %s\n", getRata());
	}
	
	public static void main(String[] args) {
		Siswa krisna = new Siswa();
		
		krisna.setNama("Krisna");
		krisna.setNpm("14.125.781.101");
		krisna.setMtk(70);
		krisna.setIndo(60);
		krisna.setPbo(65);
		
		krisna.cetakData();
	}
	
}
