import java.util.*;

public class Modulb3no1Rekursif {

	static Scanner xx= new Scanner(System.in);
	
	public static void main(String [] args) {
		double x= xx.nextDouble();
		double y= xx.nextDouble();
		double max= (double) Math.max(x, y);
		double min= (double) Math.min(x, y);
		Rekursif(min, max);
	}
	
	public static void Rekursif(double min, double max) {
		if(min<=max) {
			if(min%2==0 && min<0)System.out.println((int)min+"\tgenap negatif");
			if(min%2!=0 && min<0)System.out.println((int)min+"\tganjil negatif");
			if(min==0)System.out.println((int)min);
			if(min%2==0 && min>0)System.out.println((int)min+"\tgenap positif");
			if(min%2!=0 && min>0)System.out.println((int)min+"\t"
					+ "ganjil positif");
			min++;
			Rekursif(min, max);
		}
	}
}
