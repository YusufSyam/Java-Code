package BelajarOOP;

import java.util.Scanner;

public class Hewanmu {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		Hewan Hewanmu= new Hewan();
		
		System.out.print("Jenis hewan\t: ");
		Hewanmu.jenisHewan= xx.next();
		
		System.out.print("Nama hewan\t: ");
		Hewanmu.namaHewan= xx.next();
		
		System.out.print("Sifat si "+Hewanmu.namaHewan+"\t: ");
		Hewanmu.sifatHewan= xx.next();
		
		Hewanmu.run();
	}
}
