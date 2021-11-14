import java.util.Scanner;

public class Soal8nomor2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String n= xx.nextLine();
		for(int i=0; i<n.length(); i++) {
			int a= Character.codePointAt(n,  i);
			if(a>=97 && a<=122) System.out.print(Character.toString(a-32));
			else System.out.print(Character.toString(a));
		}
	}
}
