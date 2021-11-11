import java.util.Scanner ;

	class Array2dkelas2{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			int baris= xx.nextInt();
			int kolom= xx.nextInt();
			int [][] matriks= new int[baris][kolom];
			int loop1,loop2;
			for(loop1=0; loop1<baris; loop1++){
				for(loop2=0; loop2<kolom; loop2++){
				matriks [loop1][loop2]= xx.nextInt();	
			}
			}
			for(loop1=0; loop1<kolom; loop1++){
				System.out.println();
				for(loop2=(baris-1); loop2>=0; loop2--){
					System.out.print(matriks [loop2][loop1]+" ");
			}
			}
			}
			}