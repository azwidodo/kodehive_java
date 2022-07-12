package com.fundamental.day5.oop2;

public class Penjualan implements CRUDD {

	public static void main(String[] args) {
		
		Penjualan penjualan = new Penjualan();
		
		penjualan.create();
		penjualan.read();
		penjualan.update();
		penjualan.delete();
		penjualan.detail();
	}

	@Override
	public void create() {
		System.out.println("Running Penjualan Create...");
	}

	@Override
	public void read() {
		System.out.println("Running Penjualan Read...");
	}

	@Override
	public void update() {
		System.out.println("Running Penjualan Update...");
	}

	@Override
	public void delete() {
		System.out.println("Running Penjualan Delete...");
	}

	@Override
	public void detail() {
		System.out.println("Running Penjualan Detail...");
	}

}
