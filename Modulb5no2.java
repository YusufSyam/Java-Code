import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Modulb5no2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		try{
			int n= xx.nextInt();
			int m= xx.nextInt();
			String serialNumber= generateSerial(n, m);
			System.out.println(serialNumber);
		}catch(InputMismatchException ime) {
			System.out.print("Input hanya terdiri dari angka");
		}
		}
	
	public static String generateSerial(int n, int m) {
		String str = "";
		Random random= new Random();
		int acak;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					acak= random.nextInt(10);
					str+= String.valueOf(acak);
				}
				str+= i==n-1? " " : "-";
				}
			return str;
			}
			}
