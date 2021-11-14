import java.util.Scanner;

public class Soal5nomor3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int n= xx.nextInt();
		if(n>0) System.out.println(n+" positif");
		else if(n==0) System.out.println(n+" nol");
		else if(n<0) System.out.println(n+" negatif");
	}
}
