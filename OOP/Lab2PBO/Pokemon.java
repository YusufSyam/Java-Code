import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

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
