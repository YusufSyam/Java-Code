import java.util.*;

public class Modulb3no2Rekursif {
	
	static Scanner xx= new Scanner(System.in);
	
	public static void main(String [] args) {
		int angka= 1;
		Rekursif(xx.nextInt(), xx.nextInt(), angka);
	}
	
	public static void Rekursif(int x,int y, int angka) {
		System.out.print(angka+"\t");
		angka++;
		if(angka>y)return;
		if((angka-1)%x==0) {
			System.out.println();
			Rekursif(x, y, angka);
		}else {
			Rekursif(x, y, angka);
		}
	}
}
