import java.util.Scanner;
import java.util.InputMismatchException;

public class Modulb5no3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		try {
			int umur= xx.nextInt();
			tahun(umur);
			bulan(umur, tahun(umur));
			hari(umur, tahun(umur), bulan(umur, tahun(umur)));
			myDay(umur, tahun(umur), bulan(umur, tahun(umur)), hari(umur, tahun(umur), bulan(umur, tahun(umur))));
		}catch(InputMismatchException ime) {
			System.out.print(ime.getMessage());
		}
	}
	
	public static int tahun(int x) {
		int hasil= x/360;
		return hasil;
	}
	
	public static int bulan(int x, int y) {
		int hasil= (x-(y*360))/30;
		return hasil;
	}
	
	public static int hari(int x, int y, int z) {
		int hasil=x-((y*360)+(z*30));
		return hasil;
	}
	
	public static void myDay(int umur, int tahun, int bulan, int hari) {
		System.out.println(tahun(umur)+" tahun");
		System.out.println(bulan(umur, tahun(umur))+" bulan");
		System.out.println(hari(umur, tahun(umur), bulan(umur, tahun(umur)))+" hari");
	}
	}
