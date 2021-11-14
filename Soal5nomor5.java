import java.util.Scanner;

public class Soal5nomor5 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String input= xx.nextLine();
		for(int i= 0; i< input.length(); i++) {
			if(i==0 || i==input.length()-1) System.out.print(input.substring(i,i+1)+" ");
			else System.out.print(Character.codePointAt(input, i)+" ");
		}
	}
}
