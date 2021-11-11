import java.util.Scanner;

public class Uri1435 {

    public static void main(String[] args){
    	Scanner xx = new Scanner(System.in);
		
    	int x= xx.nextInt();
    	int y;
		
    	if(x != 0) {
    		for (int i=1; i<=x; i++) {
    			for (int j=1 ; j<=x; j++) {
    				y= i;
                    if(j < y) y= j;
                    if((x-i+1) < y) y= x-i+1;
                    if((x-j+1) < y) y= x-j+1;
                    
                    System.out.printf("%3d%s",y, j == x ? "\n" : " ");
            }
    }
    }
    }
	}