package com.fundamental.day5.oop2;

public class Produk implements CRUDD {

	public static void main(String[] args) {
		
		Produk produk = new Produk();
		
		produk.create();
		produk.read();
		produk.update();
		produk.delete();
		produk.detail();
	}

	@Override
	public void create() {
		System.out.println("Running Produk Create...");
	}

	@Override
	public void read() {
		System.out.println("Running Produk Read...");
	}

	@Override
	public void update() {
		System.out.println("Running Produk Update...");
	}

	@Override
	public void delete() {
		System.out.println("Running Produk Delete...");
	}

	@Override
	public void detail() {
		System.out.println("Running Produk Detail...");
	}

}
