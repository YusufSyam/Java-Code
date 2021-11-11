package ItemStore;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static Scanner xx= new Scanner(System.in);
	static ArrayList <String> mapItem= new ArrayList<>();
	static int naikHarga= 0;
	static User player;
	
	public static void main(String [] args) {
		
		System.out.print("(GM) > Masukkan Nama : ");
		player= new User(xx.nextLine());
		
		System.out.print("(GM) > Masukkan Nama Toko : ");
		player.setNamaToko(xx.nextLine());
		
		System.out.println("(GM) > Kamu berperan sebagai pemilik sebuah toko yang berada di Orario");
		System.out.println("(GM) > Uang modal mu sekarang 100 tembaga, pertama-tama beli sesuatu untuk dijual kembali..");
		System.out.println(">> Kamu pergi ke sebuah toko Grosir..");
		System.out.println();
		
	}
	
	static void setItems() {
		Item airGelas= new Item("Air Gelas",5,"minuman");
		Item airBotol= new Item("Air Botol",50,"minuman");
		
		Item rotiBiasa= new Item("Roti",10,"makanan");
		Item telur= new Item("Telur",20,"makanan");
		Item yakisoba= new Item("Yakisoba",50,"makanan");
		Item kue= new Item("Kue",100,"makanan");
		
		Item gacha1= new Item("Gacha level-1",50,"Gacha");
		Item gacha2= new Item("Gacha level-2",150,"Gacha");
		Item gacha3= new Item("Gacha level-3",400,"Gacha");
		Item gacha4= new Item("Gacha level-4",750,"Gacha");
		
		Item special1= new Item("Patung pahlawan Orario",350,"spesial");
		Item special2= new Item("Patung pahlawan Orario",750,"spesial");		
		Item special3= new Item("Patung pahlawan Orario",1000,"spesial");
		
		Item potion= new Item("Potion",200,"minuman spesial");
		
	}
	
}
