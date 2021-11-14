import java.util.ArrayList;
import java.util.Scanner;

public class Tes3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		ArrayList <String> isi= new ArrayList<>();
		isi.add("Adakah;kakaka;oooo;iii");
		isi.add("Adakah;saasas;ewererw;fddf");
		isi.add("Adakah;qwqww;eere;r");
		String [][] s= new String [isi.size()][4];
		for(int i=0; i<isi.size(); i++) {
			s[i]= isi.get(i).split(";");
			for(int j=0; j<4; j++) {
				System.out.println(s[i][j]);
			}
		}
		
		if(2<isi.size()) {
			System.out.print(isi.get(2));
		}
		
		boolean jalanTross= true;
		
		while(jalanTross==true) {
		System.out.println("Huruf : ");
		String abcd= xx.next();
		System.out.println(Character.codePointAt(abcd, 0));
		if(abcd.equals("e"))break;
		}
		
		
		

	}
}
