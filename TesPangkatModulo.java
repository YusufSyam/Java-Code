import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.math.BigInteger; 

public class TesPangkatModulo {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		System.out.print("Masukkan angka: ");
		String x= xx.next();
		System.out.print("Masukkan pangkat: ");
		int pangkat= xx.nextInt();
		System.out.print("Masukkan modulo: ");
		String modulo= xx.next();
		BigInteger xB = new BigInteger(x); 
		BigInteger mB = new BigInteger(modulo); 
		System.out.println(x+"^"+pangkat+"%"+modulo+"= "+ (xB.pow(pangkat)).mod(mB));
	/*	int intX= Integer.parseInt(x);
		int modX= Integer.parseInt(modulo);
		
		BigInteger pembandingString= new BigInteger(""+((int)Math.pow(intX,pangkat)));
		System.out.println(pembandingString);
		System.out.println(xB.pow(pangkat));
		System.out.println(pembandingString.compareTo(xB.pow(pangkat))==0);	*/
	}
	
	}
