import java.util.*;

public class MethodOL {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int a= 4;
		int b= 2;
		System.out.println("Integer = "+perkalian(a,b));
		double c= 5.5;
		double d= 2.1;
		System.out.println("Double = "+perkalian(c,d));
		long e= 1000091090;
		long f= 32893772;
		System.out.println("Long = "+perkalian(e,f));
		float g= 0.7f;
		float h= 10.5f;
		System.out.println("Float = "+perkalian(g,h));
		System.out.println("Integer double "+perkalian(a,c));
		System.out.println("Long float = "+perkalian(f,h));
	}
	
	public static int perkalian(int x, int y) {
		int hasil= x*y;
		return hasil;
	}
	
	public static double perkalian(double x, double y) {
		double hasil= x*y;
		return hasil;
	}
	
	public static long perkalian(long x, long y) {
		long hasil= x*y;
		return hasil;
	}
}
