import java.util.Scanner;

	public class Tugas01_Final_H071191044 {
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			int batas= xx.nextInt();
			int [] arr= new int[batas];
			double jumlah= 0;
			for(int i=0; i<batas; i++) {
				arr[i]= xx.nextInt();
				jumlah+=arr[i];
			}
			
			double rata2= jumlah/batas;
			double error;
			
				System.out.println("____________________________________");
				System.out.println("| No |     Data     |    Error     |");
				System.out.println("|____|______________|______________|");
				
			for(int i=0; i<batas; i++) {
				error= Math.pow(Math.pow((rata2-arr[i]), 2), 0.5);
				if(error>=10 && error<100) {
					System.out.printf("| %2d |      %2d      |    %.3f    |\n",(i+1),arr[i],error);
				}else if(error>=100){
					System.out.printf("| %2d |      %2d      |    %.3f   |\n",(i+1),arr[i],error);
				}else {
					System.out.printf("| %2d |      %2d      |    %.3f     |\n",(i+1),arr[i],error);
			}
			}
				System.out.println("|____|______________|______________|");
			}
			}
