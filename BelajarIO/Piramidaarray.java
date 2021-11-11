import java.util.Scanner;

	class Piramidaarray{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			int baris= xx.nextInt();
			int [][] piramida= new int[baris][baris];
			int loop1, loop2, loop3;
			for(loop1=0; loop1<baris; loop1++){
				for(loop2=0; loop2<=loop1; loop2++){
					piramida[loop1][loop2]= xx.nextInt();
				}
			}
			for(loop1=0; loop1<=baris; loop1++){
				for(loop2=0; loop2<=loop1; loop2++){
					if(baris%2==0){
						if(piramida[0][0]+piramida[loop1+1][loop2]+piramida[loop1+2][loop2]>piramida[0][0]+piramida[loop1+1][loop2]+piramida[loop1+2][loop2+1]){
							piramida[0][0]+=piramida[loop1+1][loop2]+piramida[loop1+2][loop2];
						}
						
					}else{
						
						
						
						
						
					}
				}
			}
			
			
		}
	}