import java.util.*;

public class MethodRekursif {

	static Scanner xx= new Scanner(System.in);
	
	public static void main(String [] args) {
		Rekursif(xx.nextInt(), xx.nextInt());
	}
	
	static void Rekursif(int a, int b) {
		System.out.println("Angka : "+b);
		b--;
		if(b!=a)Rekursif(a, b);
	}
}
