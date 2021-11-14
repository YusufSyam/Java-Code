import java.util.Scanner;
import java.util.ArrayList;

public class BukanFibonacci {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int n= xx.nextInt();
		int batasFibonacci= n;
		if(n<7 && n>=0) batasFibonacci+=10;
		int [] fibonacci= new int[49];
		ArrayList <Integer> bukanFibonacci= new ArrayList<>();
			for(int i=0; i<=batasFibonacci; i++) {
				fibonacci[i]=fibonacciRekursi(i);
			}

		int indeksFibonacci= 0;
		
			for(int i=0; i<=fibonacci[batasFibonacci]*5; i++) {	
				if(i!=fibonacci[indeksFibonacci]) {
					bukanFibonacci.add(i);
				}else {
					if(indeksFibonacci==1) {
						indeksFibonacci++;
					}
					indeksFibonacci++;
				}
				if(bukanFibonacci.size()-1==n) {
					System.out.println(bukanFibonacci.get(n-1));
					break;
				}
				}
		xx.close();
		}
	
	public static int fibonacciRekursi(int a) {
		if(a<2) {
			return a;
		}else {
			return fibonacciRekursi(a-1)+fibonacciRekursi(a-2);
		}	
	}
}
