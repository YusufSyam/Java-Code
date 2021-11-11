package BelajarOOP;

import java.util.Scanner;

public class Mobilmu {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		Mobil Mobilkamu= new Mobil();
		
		System.out.print("Pemilik mobil\t: ");
		Mobilkamu.pemilikMobil= xx.nextLine();
		System.out.print("Jenis mobil\t: ");
		Mobilkamu.jenisMobil= xx.nextLine();
		System.out.print("Warna mobil\t: ");
		Mobilkamu.warnaMobil= xx.nextLine();
		System.out.print("Kecepatan Maks Mobil: ");
		Mobilkamu.kecepatanMaksMobil= xx.nextDouble();
		xx.close();
		
		Mobilkamu.jalankan();
	}
}
