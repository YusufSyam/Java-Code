import java.util.Scanner;

public class Method {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int a= xx.nextInt();
		int b= xx.nextInt();
		int c= xx.nextInt();
		int d= xx.nextInt();
		int e= xx.nextInt();
		
		System.out.println("a = "+luas(a,b,c)+"\nb = "+luas(d, e));
	}
	
	public static int luas(int a, int b, int c) {
		return c;
	}
	
	public static int luas(int a, int c) {
		return c;
	}
}
