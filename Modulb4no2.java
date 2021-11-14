import java.util.Scanner;
import java.util.InputMismatchException;

	class Modulb4no2{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			try{
				int i= xx.nextInt();
				int j= xx.nextInt();
				int k= xx.nextInt();
				int [][] m1= new int [i][j];
				int [][] m2= new int [j][k];
				int [][] m3= new int [i][k];
				int ulang,ulang2,ulang3;
					for(ulang=0; ulang<i; ulang++){
						for(ulang2=0; ulang2<j; ulang2++){
							m1 [ulang][ulang2]= xx.nextInt();
						}
						}
					for(ulang=0; ulang<j; ulang++){
						for(ulang2=0; ulang2<k; ulang2++){
							m2 [ulang][ulang2]= xx.nextInt();
						}
						}
					for(ulang=0; ulang<i; ulang++){
						for(ulang2=0; ulang2<k; ulang2++){
							for(ulang3=0; ulang3<j; ulang3++){
							m3[ulang][ulang2]+=(m1[ulang][ulang3]*m2[ulang3][ulang2]);
						}
						}
						}
					System.out.println();
					for(ulang=0; ulang<i; ulang++){
						for(ulang2=0; ulang2<k; ulang2++){
							System.out.printf("%4s",m3[ulang][ulang2]);
						}
							System.out.println();
						}
			}catch(InputMismatchException xyz){
				System.out.print("Input hanya tediri dari angka");
			}
			}
			}