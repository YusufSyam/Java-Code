import java.util.Scanner;

public class Uri1185 {
    public static void main(String[] args) {

    	Scanner iswanto = new Scanner(System.in);
        double jumlah = 0;
        char O = iswanto.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        
        for (int i= 0; i< M.length; i++) {
        	for (int j= 0; j < M[i].length; j++) {
        		M[i][j]= iswanto.nextDouble();
        	}
        }
        
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		if (j < M.length-i-1) jumlah += M[i][j];
        	}
        }

        if (O == 'M') jumlah /= ((M.length * M.length) - 12) / 2;
    	System.out.println(String.format("%.1f", jumlah));
    }
	
}