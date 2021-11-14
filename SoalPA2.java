package ecl;
import java.util.*;

public class SoalPA2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		System.out.print("Koefisien x^2 : ");
		int a= xx.nextInt();
		System.out.print("Koefisien x : ");
		int b= xx.nextInt();
		System.out.print("Konstanta : ");
		int c= xx.nextInt();
		double d= (double) ((b*b)-(4*a*c));
		double akar= Math.pow(d, 0.5);
		double x1, x2;
		x1=((-b+akar)/2*a);
		x2=((-b-akar)/2*a);
		if(d==0) {
			System.out.println("Akar dari "+a+"x^2+"+b+"x+"+c+" Kembar");
			System.out.printf("x = %.2f ",x1);
		}else if(d>0) {
			System.out.println("Akar dari "+a+"x^2+"+b+"x+"+c+" berbeda");
			System.out.printf("x1 = %.2f x2= %.2f",x1,x2);
		}else {
			System.out.println("Akar dari "+a+"x^2+"+b+"x+"+c+" imajiner");
		}
		
	}
}