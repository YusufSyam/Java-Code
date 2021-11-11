package Lab2PBO;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main3 {
	
	static Scanner xx= new Scanner(System.in);
	static ArrayList <Pokemon> daftarPokemon= new ArrayList<>();;
	static ArrayList <String> namaPokemon= new ArrayList<>();
	
	public static void main(String [] args) throws Exception{
		bacaData();
		mainPage();
		
	}
	
	static void mainPage() throws Exception{
		System.out.print("Pilih opsi : \n1. Buat Pokemon\n2. Pilih Pokemon\n3. Info Pokemon\n>> ");
		String a= "0";
		
		while(a.equals("0")){
			a= xx.nextLine();
			if(a.equals("1")) makePokemon();
			else if(a.equals("2")) selectPokemon();
			else if(a.equals("3")) infoPokemon();
			else{
				System.out.print("Input salah"); 
				a="0";
		}
		}
	}
	
	static void makePokemon() throws Exception{
		System.out.println("Buat Pokemon");
		System.out.println("Name : ");
		Pokemon pokemon= new Pokemon(xx.nextLine());
		
		System.out.println("Pokemon telah lahir...\nStat Pokemon : ");
		System.out.print(pokemon.description());
		tulisData(pokemon);
		
		kembaliKeMain();
	}
	
	static void selectPokemon() throws Exception{
		System.out.print("Choose your fighter \n");
		for(int i=0; i<namaPokemon.size(); i++) {
			System.out.println((i+1)+". "+namaPokemon.get(i));
		}
		int a= xx.nextInt();
	}
	
	static void infoPokemon() throws Exception{
		System.out.print("Choose Pokemon \n");
		for(int i=0; i<namaPokemon.size(); i++) {
			System.out.println((i+1)+". "+namaPokemon.get(i));
		}
		int a= xx.nextInt();
		System.out.println(daftarPokemon.get(a-1).description());
		
		kembaliKeMain();
		
	}
	
	static void tulisData(Pokemon a)throws IOException{
		PrintWriter tulis= null;
		
		tulis= new PrintWriter("Daftar Pokemon.txt");
		for(int i=0; i<daftarPokemon.size(); i++){
			tulis.write(daftarPokemon.get(i).getName()+"#"+daftarPokemon.get(i).type+
			"#"+daftarPokemon.get(i).getLevel()+"#"+daftarPokemon.get(i).getMaxHealth()+
			"#"+daftarPokemon.get(i).getDamage()+"#"+daftarPokemon.get(i).getDefence()+
			"#"+daftarPokemon.get(i).getXP()+"\n");
		}
		tulis.write(a.getName()+"#"+a.type+"#"+a.getLevel()+"#"+a.getMaxHealth()+
				"#"+a.getDamage()+"#"+a.getDefence()+"#"+a.getXP());
		if(tulis!=null) tulis.close();
	}
	
	static void bacaData() throws IOException{
		FileReader sumberFile= null;
		BufferedReader pembacaFile= null;
		
		sumberFile= new FileReader("Daftar Pokemon.txt");
		pembacaFile= new BufferedReader(sumberFile);
		
		String baca;
		ArrayList <String> isi= new ArrayList<>();
		
		while((baca= pembacaFile.readLine())!= null){
			isi.add(baca);
		}
		
		String [][] split= new String[isi.size()][7];
		
		for(int i= 0; i<isi.size(); i++){
			split[i]= isi.get(i).split("#");
			namaPokemon.add(split[i][0]);
			System.out.println(namaPokemon.get(i));
			daftarPokemon.add(i, new Pokemon(split[i][0],Int(split[i][1]),Int(split[i][2]),Int(split[i][3]),
					Int(split[i][4]),Int(split[i][5]),Int(split[i][6])));
		}
		
		if(pembacaFile!=null) pembacaFile.close();
		if(sumberFile!=null) sumberFile.close();
	}
	
	static void kembaliKeMain() throws Exception{
		System.out.println("Tekan Enter untuk melanjutkan...");
		String a= xx.nextLine();
		if(a.equals("") || !a.equals("")) mainPage();
	}
	
	static int Int(String a) {return Integer.parseInt(a); }
	
	static void fight() {
		
		
	}
}

class Pokemon{
	
	private String name;
	int type;
	private int maxHealth;
	private int defence;
	private int damage;
	private int xp;
	private int level;
	private int health;
	
	String setType() {
		System.out.println("Pilih Elemen : ");
		System.out.println("1. Air		3. Api ");
		System.out.println("2. Tanah	4. Petir");
		
		String a= Main3.xx.nextLine();
		type= Integer.parseInt(a);
		return getType(a);
	}
	
	public Pokemon(String a){
		name= a;
		level= 1;
		xp= 0;
		setType();
		Random random= new Random();
		maxHealth= 100+random.nextInt(10);
		damage= 35+random.nextInt(5);
		defence= 5+random.nextInt(3);
		health= maxHealth;
	}
	
	public Pokemon(String name, int type, int level, int maxHealth, int damage, int defence, int xp) {
		this.name= name;
		this.type= type;
		this.level= level;
		this.maxHealth= maxHealth;
		this.damage= damage;
		this.defence= defence;
		this.xp= xp;
	}
	
	public String getName() {return name;}
	public int getLevel() {return level;}
	public int getMaxHealth() {return maxHealth;}
	public int getDamage() {return damage;}
	public int getDefence() {return defence;}
	public int getXP() {return xp;}
	
	
	public String getType(String a) {
		if(a.equals("1")) return "Air";
		if(a.equals("2")) return "Tanah";
		if(a.equals("3")) return "Api";
		if(a.equals("4")) return "Petir";
		else {
			System.out.print("Input salah..");
			return setType();
		}
	}
	
	public String description() {
		return  "Name	: "+name+
				"\nType	: "+getType(type+"")+
				"\nLevel	: "+level+
				"\nHealth	: "+maxHealth+
				"\nDamage	: "+damage+
				"\nDefence	: "+defence+
				"\nXp	: "+xp+" %\n";
	}
	
}
