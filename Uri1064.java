import java.util.Scanner;

public class Uri1064 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		double [] value= new double[6];
		int positive= 0;
		double positiveAverage= 0;
		
			for(int i=0; i<6; i++) {
				value[i]= xx.nextDouble();
				if(value[i]>0) {
					positive++;
					positiveAverage+=value[i];
				}
			}
			System.out.println(positive+" valores positivos");
			System.out.printf("%.1f\n",positiveAverage/positive);
	}
}
