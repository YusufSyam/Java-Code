import java.util.*;

public class Soal3nomor1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int n= xx.nextInt();
		String [] nama= new String [n];
		double [] nilai= new double [n];
		for(int i=0; i<n; i++) {
			nama[i]= xx.next();
			nilai[i]= xx.nextDouble();
			if(nilai[i]>100) nilai[i]= 100;
		}
		
		double min =100; int indeksMin= 0;
		for(int i=0; i<n; i++) {
			if(nilai[i]<=min) {
				min= nilai[i];
				indeksMin= i;
			}
			}
		
		min= 100;
		for(int i=0; i<n; i++) {
			if(nilai[i]<= min && i!=indeksMin) {
				min= nilai[i];
			}
			}
		
		for(int i=0; i<n; i++) {
			if(nilai[i]==min) {
				System.out.println(nama[i]);
			}
			}
	}
}
