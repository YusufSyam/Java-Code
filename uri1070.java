import java.util.Scanner;

public class uri1070 {
    public static void main(String args[]) {
    Scanner xx= new Scanner(System.in);
    int n= xx.nextInt();
    for(int i=n; i<n+12; i++){
        if(i%2!=0){
            System.out.println(i);
            i++;
        }
    }
    }
}