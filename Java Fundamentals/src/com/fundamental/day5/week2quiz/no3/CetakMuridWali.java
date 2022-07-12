package com.fundamental.day5.week2quiz.no3;

import java.util.ArrayList;

public class CetakMuridWali implements MuridWaliInterface {

	public static void main(String[] args) {
		
		CetakMuridWali output = new CetakMuridWali();
		ArrayList<String> daftarMurid = output.murid();
		ArrayList<String> daftarWali = output.wali();
		
		output.cetak(daftarMurid, daftarWali);
	}

	@Override
	public ArrayList<String> murid() {
		ArrayList<String> daftarMurid = new ArrayList<>();
		daftarMurid.add("Subastian");
		daftarMurid.add("Bastian");
		daftarMurid.add("Bernanda");
		daftarMurid.add("Marvel");
		daftarMurid.add("Marcell");
		daftarMurid.add("Sintia");
		
		return daftarMurid;
	}

	@Override
	public ArrayList<String> wali() {
		ArrayList<String> daftarWali = new ArrayList<>();
		daftarWali.add("Barno");
		daftarWali.add("Sutjiwo");
		daftarWali.add("Setyawan");
		daftarWali.add("Sri Handayani");
		daftarWali.add("Bambang");
		daftarWali.add("Sriwijaya");
		
		return daftarWali;
	}

	@Override
	public void cetak(ArrayList<String> daftarMurid, ArrayList<String> daftarWali) {
		
		System.out.println("Daftar Murid dan Wali");
		System.out.println("---------------------");
		for (int i = 0; i < daftarMurid.size(); i++) {
			System.out.println(daftarMurid.get(i) + " / " + daftarWali.get(i));
		}
		
	}

}
