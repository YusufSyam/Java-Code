import java.util.Scanner;

public class Uri1014 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		double km= xx.nextDouble();
		double fuel= xx.nextDouble();
		double consumption= km/fuel;
		System.out.printf("%.3f km/l\n",consumption);
	}
}
