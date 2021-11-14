import java.util.Scanner;

public class BentukPecahan {
	
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		double angka= xx.nextDouble();
		double x= 1; // x/y
		double y= 1;
		double satu= 1;
		
		for(int i=1; i<1000; i++) {
			if(satu/i==angka) {
				x= 1;
				if(satu!=1) x= satu;
				y= i;
				break;
			}
			if(satu/i<angka && i!=1) {
				satu++;
				i= 2;
			}
			}
		
		int pembilang= (int) x;
		int penyebut= (int) y;
		
		System.out.print(pembilang+"/"+penyebut);
		
		if(x>y && x%y!= 0) {
			int angkaDepan= (int) x/ (int) y;
			x-= (y*angkaDepan);
			pembilang= (int) x;
			System.out.print(" atau "+angkaDepan+" "+pembilang+"/"+penyebut);
		}
		
		xx.close();
		
		}
		}
