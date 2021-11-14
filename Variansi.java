import java.util.Scanner;
import java.lang.Math;

public class Variansi {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		double x= 46.375;
		double sb= 4.5;
		int n= 80;
		double jumlah= 0;
		
		for(int i=0; i<=90; i+=10) {
			int frek= xx.nextInt();
			jumlah+=Math.pow((sb+(int)i-x),2)*frek;
			System.out.println(jumlah);
		}
		
		System.out.println((double)jumlah/n);
		
	}
}
