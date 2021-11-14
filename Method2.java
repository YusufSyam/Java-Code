package ecl;

import java.util.Scanner;

public class Method2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int batas= xx.nextInt();
		double jumlahluas = 0;
		double jumlahkeliling = 0;
			for(int i=1; i<=batas; i++) {
				System.out.print("Jari-jari lingkaran "+i+" : ");
				double a= xx.nextDouble();
				llingkaran(a);
				System.out.printf("Luas lingkaran %01d = %.2f \n",i,llingkaran(a));
				jumlahluas+=llingkaran(a);
				klingkaran(a);
				System.out.printf("Keliling lingkaran %01d = %.2f \n\n",i,klingkaran(a));
				jumlahkeliling+=klingkaran(a);
				}
			System.out.printf("Rata-rata luas = %.2f",(jumlahluas/batas));
			System.out.printf("\nRata-rata keliling = %.2f",(jumlahkeliling/batas));
		}
	
		static double llingkaran(double x) {
			double hasil= (x*x*22/7);
			return hasil;
		}
		static double klingkaran(double x) {
			double hasil= (2*x*22/7);
			return hasil;
		}	
		}
