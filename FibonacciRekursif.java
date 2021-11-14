import java.util.Scanner;

	public class FibonacciRekursif {
		public static int fibonacci(int a) {
			if(a<2) {
				return a;
			}else{
				return fibonacci(a-1)+fibonacci(a-2);
			}
		
		}
		
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			int a= xx.nextInt();
			for(int i=0; i<a; i++) {
			if(i==(a-1))System.out.print(fibonacci(i));
			else System.out.print(fibonacci(i)+"-");
			}
			xx.close();
		}
}
