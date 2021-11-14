import java.util.*;

public class PecahAngka {
	public static void main(String [] args) {
		Scanner xxx= new Scanner(System.in);
		int n= xxx.nextInt();
		String kata= Integer.toString(n);
		System.out.println(kata);
		int panjang= kata.length();
		char [] huruf= new char [kata.length()];
		int i;
		for(i=0; i<huruf.length; i++) {
			huruf[i]= kata.charAt(i);
			System.out.println("Char - "+i+" = "+huruf[i]);
		}
		System.out.println();
		int nbaru=0;;
		for(int b : huruf) {
			nbaru= Math.abs(b)-48;
			System.out.println(nbaru);
			if(n%nbaru == 0) {
				System.out.println(n+" bisa dibagi dengan "+nbaru);
			}else {
				System.out.println(n+" tidak bisa dibagi dengan "+nbaru);

			}
		}
	}
}
