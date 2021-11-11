class Player{
	
	private String name, role;
	private int level, money;
	private double damage, hp, energy;
	private Items [] item= new Items[];
	static Scanner xx= new Scanner();
	
	public void Player(String a){
		name= a;
		role= selectRole();
		level= 1;
		money= 0;
		hp= 1000;
		energy= 100;
		damage= 200;
	}
	
	public String selectRole(){
		System.out.println("---Select Role---\n1. Warrior\n2. Mage\n3. Archer\n4. Tanker\n>> ");
		int a= xx.nextInt();
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
	
}

class Main3{
	public static void main(String [] args){
	
	
	
	
	}
}

class Items{
	private String name, info;
	private int price;
	
	public void use(){
		
	}
	
	public void sell(){
		
	}
	
	public void destroy(){
		
	}
	
}

