package Lab3PBO;

import java.util.Scanner;
import java.util.Random;

class MainPlan{
	
	static Scanner xx= new Scanner(System.in);
	static Random random= new Random();
	public static void main(String [] args){
		setItems();
		
		System.out.println("Masukkan nama player 1 : ");
		Player p1= new Player(xx.nextLine());
		
		mainMenu(p1);
		
	}
	
	static String mainMenu(Player p1) {
		System.out.println("Pilih Opsi yang akan dilakukan\n1. Periksa status player\n2. Periksa tas\n3. Beli perlengkapan\n4. Tidur\n5. Berlatih\n6. Bertarung dengsn player lain\n7. Keluar kota mencari monster ");
		String opsi= xx.next();
		if(opsi.equals("1")) p1.showStatus();
		if(opsi.equals("2")) p1.checkInventory();
		if(opsi.equals("3")) p1.showItems();
		if(opsi.equals("4")) p1.sleep();
		if(opsi.equals("5")) p1.train();
		if(opsi.equals("6")) p1.fight(p2);
		if(opsi.equals("7")) {
			p1.fight(p1.lookForMonsters());
		}
		System.out.println("Input salah..");
		return mainMenu(p1);
	}
	
	static void setItems() {
		Item [] items= new Item[5];
		
		items[0].setName("Baju Pengelana");
		items[1].setName("Armor Besi");
		items[2].setName("Jubah Sihir");
		items[3].setName("Seragam Petarung");
		items[4].setName("Sarung Wadimor");
		
		items[0].setPrice(100);
		items[1].setPrice(200);
		items[2].setPrice(150);
		items[3].setPrice(150);
		items[4].setPrice(250);
		
		items[0].setInfo("");
		items[1].setInfo("");
		items[2].setInfo("");
		items[3].setInfo("");
		items[4].setInfo("");
	}
}
