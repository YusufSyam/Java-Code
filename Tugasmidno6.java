package ecl;

import java.util.Scanner;

public class Tugasmidno6 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int batas= xx.nextInt();
		int [][] piramida= new int [batas][];
		int i, j, k, l, kiri, kanan;
		
			for(i=0; i<batas; i++) {
				piramida[i]= new int[i+1];
			}	
			
			for(i=0; i<batas; i++) {
				for(j=0; j<piramida[i].length; j++) {
					piramida[i][j]= xx.nextInt();
			}
			}
		
			kiri= 0; kanan= 1; i=0;
			int maksKiri= piramida[i][kiri]+piramida[i+1][kiri];
			int maksKanan= piramida[i][kanan-1]+piramida[i+1][kanan];
			
			for(i=1; i<(batas-1); i++) {
					if(maksKiri+piramida[i+1][kiri]>=maksKiri+piramida[i+1][kiri+1]){
							maksKiri+= piramida[i+1][kiri];
					}else if(maksKiri+piramida[i+1][kiri]<=maksKiri+piramida[i+1][kiri+1]) {
							maksKiri+=piramida[i+1][kiri+1];
					}
					if(maksKanan+ piramida[i+1][kanan]>= maksKanan+piramida[i+1][kanan+1]){
							maksKanan+= piramida[i+1][kanan];
					}else if(maksKanan+ piramida[i+1][kanan]<= maksKanan+piramida[i+1][kanan+1]){
							maksKanan+=piramida[i+1][kanan+1];
							kiri=kanan;
							kanan++;
					}
					}
					int maks= Math.max(maksKiri, maksKanan);
					System.out.print(maks);
					}
					}
		