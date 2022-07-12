package com.fundamental.day5.oop2;

public class StrukturOrganisasi implements CRUDD {

	public static void main(String[] args) {
		
		StrukturOrganisasi struktur = new StrukturOrganisasi();
		
		struktur.create();
		struktur.read();
		struktur.update();
		struktur.delete();
		struktur.detail();
	}

	@Override
	public void create() {
		System.out.println("Running StrukturOrganisasi Create...");
	}

	@Override
	public void read() {
		System.out.println("Running StrukturOrganisasi Read...");
	}

	@Override
	public void update() {
		System.out.println("Running StrukturOrganisasi Update...");
	}

	@Override
	public void delete() {
		System.out.println("Running StrukturOrganisasi Delete...");
	}

	@Override
	public void detail() {
		System.out.println("Running StrukturOrganisasi Detail...");
	}

}
