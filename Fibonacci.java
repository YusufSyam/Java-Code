import java.util.Scanner;

	public class Fibonacci {
		public static int fibonacci(int a) {
			if(a<2) {
				return a;
			}else{
				return fibonacci(a-1)+fibonacci(a-2);
			}
		
		}
		
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			int N= xx.nextInt();
			System.out.print(fibonacci(N)+"-");
			xx.close();
		}
}
