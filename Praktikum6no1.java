import java.util.Scanner;
	
public class Praktikum6no1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String nama= xx.nextLine();
		char [] huruf= nama.toCharArray();
		int maju= xx.nextInt();
		
		for(int i=0; i<nama.length(); i++) {
			huruf[i]= nama.charAt(i);
			System.out.print(huruf[i]+=maju);
		}	
		}
		}
