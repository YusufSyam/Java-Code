import java.util.Scanner;
import java.util.InputMismatchException;

	class Volley{
		public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
			int n= xx.nextInt();
			String [] nama= new String[n];
			int [][] dilakukan= new int[n][3];
			int [][] berhasil= new int[n][3];
			double service=0;
			double serviceb=0;
			double block=0;
			double blockb=0;
			double smash=0;
			double smashb=0;
			double h1,h2,h3;
			
				for(int ulang=0; ulang<n; ulang++){
					nama [ulang]= xx.next();
						dilakukan [ulang][0]= xx.nextInt();
						service= ((service+dilakukan[ulang][0]));
						dilakukan [ulang][1]= xx.nextInt();
						block=((block+dilakukan[ulang][1]));
						dilakukan [ulang][2]= xx.nextInt();
						smash=((smash+dilakukan[ulang][2]));
						berhasil [ulang][0]= xx.nextInt();
						serviceb=(serviceb+(berhasil[ulang][0]));
						berhasil [ulang][1]= xx.nextInt();
						blockb=(blockb+(berhasil[ulang][1]));
						berhasil [ulang][2]= xx.nextInt();
						smashb=(smashb+(berhasil[ulang][2]));
						}
						
				h1=(double) ((serviceb*100)/service);
				h2=(double) ((blockb*100)/block);
				h3=(double) ((smashb*100)/smash);
				
				if(serviceb>service || blockb>block || smashb>smash){
					System.out.print("Input salah");
				}else{
				
					System.out.printf("Pontos de Saque: %.2f ",h1);
					System.out.print("%.\n");
					System.out.printf("Pontos de Bloqueio: %.2f ",h2);
					System.out.print("%.\n");
					System.out.printf("Pontos de Ataque: %.2f ",h3);
					System.out.print("%.\n");
				}
			xx.close();
		}
		}