import java.util.Scanner;

public class Uri1176 {
	
	//fibonacci tanpa array dan rekursi
	
    public static void main(String[] args){
        Scanner xx = new Scanner(System.in);
        int T = xx.nextInt();
        for (int j = 0; j < T; j++) {
        	int N = xx.nextInt();
            long N0 = 0, N1 = 1, proximo;
	        for (int i=0; i < N; i++) {
	        	proximo = N0 + N1;
	        	N0 = N1;
	        	N1 = proximo;
	        }
	        System.out.println("Fib("+ N +") = " + N0);
        }
    }
	
}