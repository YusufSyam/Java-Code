import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum7no2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int input1= xx.nextInt();
		int input2= xx.nextInt();
		int maks= Math.max(input1,  input2);
		int min= Math.min(input1, input2);
		ArrayList<String> DeretAngkaYgBisaDibagi= new ArrayList<>();
		System.out.print("[");
		
			for(int i=min; i<=maks; i++) {
				if(AngkaYgBisaDiBagi(i)!="") {
				DeretAngkaYgBisaDibagi.add(AngkaYgBisaDiBagi(i));
				}	
				}
			for(int i=0; i<DeretAngkaYgBisaDibagi.size(); i++) {
				if(i!=DeretAngkaYgBisaDibagi.size()-1) {
					System.out.print(DeretAngkaYgBisaDibagi.get(i)+", ");
				}else {
					System.out.print(DeretAngkaYgBisaDibagi.get(i)+"]");
				}
				}	
				}
	
	public static String AngkaYgBisaDiBagi(int a) {
		String kata= Integer.toString(Math.abs(a));
		char [] huruf= new char [kata.length()];
		int aBaru=0;
		
			for(int i=0; i<huruf.length; i++) {
				huruf[i]= kata.charAt(i);
			}
			
			for(int b : huruf) {
				aBaru= Math.abs(b)-48;
				if(a==0) {
					break;
				}
				if(aBaru==0 || a%aBaru != 0) {
					return "";
			}
			}
			
		if (a<0) {
			return "-"+kata;
		}else{
			return kata;
		}		

	}
}
