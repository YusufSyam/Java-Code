package ecl;
import java.util.*;

public class SoalPA3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		System.out.print("Masukkan jumlah data : ");
		int n= xx.nextInt();
		int [] x= new int[n];
		int jumlah= 0;
		for(int i=0; i<n; i++) {
			System.out.print("Data ke "+(i+1)+" : ");
			x[i]= xx.nextInt();
			jumlah+=x[i];
		}
		double rata2= (double) jumlah/n;
		System.out.printf("Rata-rata : %.2f ",rata2);
	}
}