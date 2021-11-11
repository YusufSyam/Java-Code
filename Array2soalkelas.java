import java.util.Scanner;

	class Array2soalkelas{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			int baris= xx.nextInt();
			int kolom= xx.nextInt();
			int [][] matriks= new int[baris][kolom];
			int i, j, k;
				for(i=0; i<baris; i++){
					for(j=0; j<kolom; j++){
						matriks[i][j]= xx.nextInt();
				}
				}
				for(i=0; i<kolom; i++){
					System.out.println();
					for(j=(baris-1); j>=0; j--){
						System.out.print(matriks[j][i]+" ");
				}
				}
				}
				}