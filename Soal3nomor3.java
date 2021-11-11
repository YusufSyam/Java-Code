import java.util.*;

public class Soal3nomor3{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		String input= xx.nextLine();
		for(int i=0; i<input.length(); i++){
			int a= Character.codePointAt(input, i);
			if(a>=65 && a<=90) System.out.print(Character.toString(a+32));
			else if(a>=97 && a<=122) System.out.print(Character.toString(a-32));
			else System.out.print(Character.toString(a));
		}
	}
}