package Polymorphism;

public class Main {
	public static void main(String [] args) {
		Hewan hewan= new Hewan();
		hewan.nama= "Naruto";
		hewan.desc();
		
		Kucing kucing= new Kucing();
		kucing.nama= "Cat";
		kucing.desc();
		
		hewan.desc();
		hewan= kucing;
		hewan.desc();
		
		Ayam ayam= new Ayam();
		ayam.nama= hewan.nama;
		
		hewan= ayam;
		hewan.desc();
		hewan= new Hewan();
		hewan.desc();
		
/*Tidak kucing= (Kucing) new Hewan();
Bisa    kucing.desc();
*/		

	}
}
