package ecl;
import java.util.*;

public class SoalPA1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		System.out.print("Masukkan nilai : ");
		int a= xx.nextInt();
		if(a>=80 && a<=100) {
			System.out.print("Nilai "+a+" mendapat grade A");
		}else if(a>=70 && a<80){
			System.out.print("Nilai "+a+" mendapat grade B");
		}else if(a>=50 && a<70) {
			System.out.print("Nilai "+a+" mendapat grade C");
		}else if(a>=35 && a< 50) {
			System.out.print("Nilai "+a+" mendapat grade D");
		}else if(a>=0 && a<35) {
			System.out.print("Nilai "+a+" mendapat grade E");
		}else {
			System.out.print("Input salah");
		}
	}
}
