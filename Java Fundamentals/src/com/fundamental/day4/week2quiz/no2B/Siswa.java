package com.fundamental.day4.week2quiz.no2B;

public class Siswa {

	String nama;
	String npm;
	int mtk;
	int indo;
	int pbo;
	
	protected String getNama() {
		return nama;
	}
	protected void setNama(String nama) {
		this.nama = nama;
	}
	protected String getNpm() {
		return npm;
	}
	protected void setNpm(String npm) {
		this.npm = npm;
	}
	protected int getMtk() {
		return mtk;
	}
	protected void setMtk(int mtk) {
		this.mtk = mtk;
	}
	protected int getIndo() {
		return indo;
	}
	protected void setIndo(int indo) {
		this.indo = indo;
	}
	protected int getPbo() {
		return pbo;
	}
	protected void setPbo(int pbo) {
		this.pbo = pbo;
	}
	
	protected int getRata() {
		return Integer.valueOf(getMtk() + getIndo() + getPbo()) / 3;
	}
	
	protected void cetakData() {
		System.out.printf("Nama: %s\n", getNama());
		System.out.printf("NPM/NIM: %s\n", getNpm());
		System.out.printf("Nilai Matematika: %s\n", getMtk());
		System.out.printf("Nilai B Indonesia: %s\n", getIndo());
		System.out.printf("Nilai PBO: %s\n", getPbo());
		System.out.printf("Nilai Rata-rata: %s\n", getRata());
	}
}
