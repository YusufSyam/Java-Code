import java.util.*;

public class Modulb3no3Rekursif {
	
	static Scanner xx= new Scanner(System.in);
	
	public static void main(String [] args) {
		int x= xx.nextInt();
		for(int i= 0; i<x; i++) {
			System.out.println("Bilangan fibonacci -"+(i+1)+" = "+Rekursif(i));
		}
	}
	
	public static int Rekursif(int x) {
		if(x<2) {
			return x;
		}else {
			return Rekursif(x-2)+Rekursif(x-1);
		}		
		
		
	}
}
