import java.util.Scanner;

public class KombinasiRekursif {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		System.out.print("Angka ");
		int n= xx.nextInt();
		System.out.print("Kombinasi ");
		int r= xx.nextInt();
		int nr= n-r;
		int kombinasi=(faktorial(n)/(faktorial(r)*faktorial(nr)));
		System.out.println("Adalah "+kombinasi);
	}
	
	public static int faktorial(int x) {
		if(x==0 || x==1) {
			return 1;
		}else {
			return x*faktorial(x-1);
		}
	}
	
	
}
