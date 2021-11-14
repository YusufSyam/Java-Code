import java.util.Scanner;

public class Uri1186 {
	public static void main(String [] args) {
		
		Scanner xx= new Scanner(System.in);
		char sm= xx.next().toUpperCase().charAt(0);
		
		double [][] arr= new double[12][12];
		int atas= 11;
		double jumlah= 0;
		
		for(int i=0; i<12; i++) {
			for(int j=0; j<12; j++) {
				arr[i][j]= xx.nextDouble();
				if(i>0 && j>atas) {
					jumlah+=arr[i][j];
				}
			}
			atas--;
		}
		
		if(sm=='S') System.out.println(jumlah);
		else if(sm=='M') System.out.println(jumlah/12);
	}
	
}
