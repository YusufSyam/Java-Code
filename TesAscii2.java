import java.util.Scanner;
class TesAscii2{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		System.out.print("Masukkan panjang: ");
		int panjang= xx.nextInt();
		for(int i=0; i<panjang; i++){
			System.out.println((char)(i+97));
		}
		
	}
}