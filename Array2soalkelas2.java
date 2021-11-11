import java.util.Scanner;

	class Array2soalkelas2{
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
				System.out.println("Input baris yang akan dijumlahkan : ");
				int jumlah= xx.nextInt();
				int hasil=0;
				for(i=0; i<baris; i++){
					if(i==(jumlah-1)){
						for(j=0; j<kolom; j++){
						hasil+=matriks[i][j];
				}
				System.out.print(hasil);
				break;
				}
				}
				}
				}