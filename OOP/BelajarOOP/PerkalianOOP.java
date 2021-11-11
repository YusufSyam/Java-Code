package BelajarOOP;
import java.util.Scanner;

public class PerkalianOOP {
	
	double hasil;
	
	public PerkalianOOP(double angka1, double angka2) {
		hasil= angka1*angka2;
	}
	
	void kalimiCeppa() {
		System.out.println("Hasil : "+hasil);
	}
	
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		PerkalianOOP kalikali= new PerkalianOOP(xx.nextInt(), xx.nextInt());
		kalikali.kalimiCeppa();
	}
}
