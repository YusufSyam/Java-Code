import java.util.Scanner;

public class RPGTest {
	public static void main(String [] args) {
		
		Scanner xx= new Scanner(System.in);
		int level= 1;
		double Hp= 500;
		double Mp= 100;
		double Atk= 100;
		double Matk= 50;
		double Def= 51;
		double Mdef= 27;
		double Aspd= 1000;
		double Cspd= 100;
		double HpRgn= 10;
		double MpRgn= 10;
		
		System.out.print("Username\t: ");
		String name= xx.nextLine();
		System.out.print("Level\t\t: ");
		int levelDestination= xx.nextInt();
		
		System.out.println("<>-<>-<>-<> Level "+level+" <>-<>-<>-<>"+"\nHealth Point\t= "+Hp+"\nMana Point\t= "+Mp+"\nAttack\t\t= "+Atk+"\nMagic Attack\t= "+Matk+"\nDefence\t\t= "+Def+
				"\nMagic Defense\t= "+Mdef+"\nAttack Speed\t= "+Aspd+"\nCast Speed\t= "+Cspd+"\nHP Regeneration\t= "+HpRgn+"\nMP Regeneration\t= "+MpRgn);
		for(int i=1; i<levelDestination; i++) {
			System.out.print("1. Agility\n2. Inteligentcy\n3. Strong\n4. Dexterity\n5. Vitality\n");
			System.out.print("Select stat to upgrade : ");
			int selectStat= xx.nextInt();
			
			switch (selectStat) {
				case 1 :
					Aspd+= 21;
					Atk+= 3;
					Cspd+= 1.3;
					HpRgn+= 1.1;
					break;
				case 2 :
					Matk+= 11;
					Mp+= 30;
					Cspd+= 4.9;
					Mdef+= 1.2;
					MpRgn+= 2;
					break;
				case 3 :
					Atk+= 19;
					Hp+= 12;
					Aspd+= 3.5;
					Def+= 0.7;
					break;
				case 4 :
					Cspd+= 20;
					Aspd+= 4;
					HpRgn+= 4;
					MpRgn+= 1.5;
					Matk+= 1.7;
					Mp+= 4;
					break;
				case 5 :
					Hp+= 106;
					Def+= 5;
					Mdef+= 4;
					HpRgn+= 10;
					Atk+= 0.5;
					break;
				default :
					i++;
					break;
			}
			
			
		}
		System.out.println("Your Stat Now : \n<>-<>-<>-<> Level "+levelDestination+" <>-<>-<>-<>"+"\nHealth Point\t= "+Hp+"\nMana Point\t= "+Mp+"\nAttack\t\t= "+Atk+"\nMagic Attack\t= "+Matk+"\nDefence\t\t= "+Def+
				"\nMagic Defense\t= "+Mdef+"\nAttack Speed\t= "+Aspd+"\nCast Speed\t= "+Cspd+"\nHP Regeneration\t= "+HpRgn+"\nMP Regeneration\t= "+MpRgn);
	}
}
