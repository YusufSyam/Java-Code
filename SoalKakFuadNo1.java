import java.util.Scanner;

public class SoalKakFuadNo1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int [][] arr= new int [12][12];
		int indeks= 11;
		double jumlah= 0;
			
			for(int i=0; i<12; i++){
				for(int j=0; j<12; j++) {
					arr[i][j]= xx.nextInt();
				}
				}
			
			for(int i=1; i<11; i++) {
				if(i<6) {
					for(int j=indeks; j<12; j++) {
						jumlah+=arr[i][j];
					}
					indeks--;
				}else if(i>=6) {
					for(int j= indeks+1; j<12; j++) {
						jumlah+=arr[i][j];
					}
					indeks++;
				}
				}
		
		System.out.printf("%.2f",jumlah/30);
	}
	}
