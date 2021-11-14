import java.util.Scanner;

public class PenjumlahanString {
	
	static Scanner xx= new Scanner(System.in);
	public static void main(String [] args) {
		String a= xx.next();
		String b= xx.next();
		int maks= Math.max(a.length(), b.length());
		
		for(int i=maks; i>=1; i--) {
			System.out.print(jumlah(a.substring(i-1, i), b.substring(i-1, i))+" ");
		}
	}
	
	public static int jumlah(String a, String b) {
		int x= Integer.parseInt(a);
		int y= Integer.parseInt(b);
		int hasil= x+y;
		//if(hasil>=10)
		return hasil;
	}
}
