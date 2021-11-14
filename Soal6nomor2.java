import java.util.Scanner;

public class Soal6nomor2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int barang= xx.nextInt();
		int n= xx.nextInt();
		switch (barang){
		case 1 :
			System.out.println(4000*n);
			break;
		case 2 :
			System.out.println(4000*n);
			break;
		case 3 :
			System.out.println(2000*n);
			break;
		case 4 :
			System.out.println(1000*n);
			break;
		default :
			System.out.println("Input salah");
		}
	}
}
