package com.fundamental.day4.week2quiz.no2C;

public class Siswa {

	String nama;
	String npm;
	int mtk;
	int indo;
	int pbo;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	public int getMtk() {
		return mtk;
	}
	public void setMtk(int mtk) {
		this.mtk = mtk;
	}
	public int getIndo() {
		return indo;
	}
	public void setIndo(int indo) {
		this.indo = indo;
	}
	public int getPbo() {
		return pbo;
	}
	public void setPbo(int pbo) {
		this.pbo = pbo;
	}
	
	public int getRata() {
		return Integer.valueOf(getMtk() + getIndo() + getPbo()) / 3;
	}
	
	public void cetakData() {
		System.out.printf("Nama: %s\n", getNama());
		System.out.printf("NPM/NIM: %s\n", getNpm());
		System.out.printf("Nilai Matematika: %s\n", getMtk());
		System.out.printf("Nilai B Indonesia: %s\n", getIndo());
		System.out.printf("Nilai PBO: %s\n", getPbo());
		System.out.printf("Nilai Rata-rata: %s\n", getRata());
	}
}
