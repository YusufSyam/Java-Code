package Lab3PBO;

import java.util.Scanner;

public class PlayerPlan{
	
	private String name, role;
	private int level, money;
	private double damage, hp, energy;
	private Item [] items= new Item[5];
	
	public PlayerPlan() {}
	
	public PlayerPlan(String a){
		name= a;
		role= selectRole();
		level= 1;
		money= 0;
		hp= 1000;
		energy= 100;
		damage= 200;
		monsterList();
	}
	
	private String selectRole(){
		System.out.println("---Select Role---\n1. Warrior\n2. Mage\n3. Archer\n4. Tanker\n>> ");
		int a= Main3.xx.nextInt();
		if(a==1) return "Warrior";
		if(a==2) return "Mage";
		if(a==3) return "Archer";
		if(a==4) return "Tanker";
		System.out.println("Input salah");
		return selectRole();
	}
	
	public void showStatus(){
		System.out.println("Name\t\t: "+name+
							"Role\t\t: "+role+
							"Levelt\t: "+level+
							"Money\t\t: "+money+
							"HP\t\t\t: "+hp+
							"Energy\t\t: "+energy+
							"Damage\t\t: "+damage);
	}
	
	public void showItems(){
		
	}
	
	public boolean attack(Player b){
		
	}
	
	public String getDamage(Player b){
		
	}
	
	public boolean healing(double a){
		
	}
	public boolean buy(Items a){
		
	}
	
	public Monster lookForMonsters() {
		int a= Main3.random.nextInt(100);

		
		if(a<50) return monster1;
		else if(a<90) return monster2;
		else return monster3;
	}
	
	Monster monster1= new Monster();
	Monster monster2= new Monster();
	Monster monster3= new Monster();
	Monster boss1= new Monster();
	
	public void monsterList() {
		monster1.name= "Goblin";
		monster2.name= "Skeleton";
		monster3.name= "Orc";
		boss1.name= "Boss Goblin garagan";
		
		monster1.hp= 450;
		monster2.hp= 400;
		monster3.hp= 700;
		boss1.hp= 1500;
		
		monster1.damage= 100;
		monster2.damage= 255;
		monster3.damage= 250;
		boss1.damage= 430;
	}
	
}

class Monster{
	String name;
	int hp;
	int damage;
}




