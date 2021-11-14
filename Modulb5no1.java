
import java.util.Scanner;
import java.util.InputMismatchException;

public class Modulb5no1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		try{
			int bilangan1= xx.nextInt();
		int bilangan2= xx.nextInt();
		cariFPB(bilangan1, bilangan2);
			System.out.print("FPB dari "+bilangan1+" dan "+bilangan2+" = "+cariFPB(bilangan1, bilangan2));
		}catch(InputMismatchException ime) {
			System.out.print("Input hanya terdiri dari angka");
		}
		}
	
	static int cariFPB(int x, int y){
		int fpb=0;
		int max= Math.max(x, y);
		for(int i=max; i>0; i--) {
			if(x%i==0 && y%i==0) {
				fpb+=i;
				break;
		}
		}
		return fpb;
		}
	}
