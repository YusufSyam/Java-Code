import java.util.Scanner;

public class TugasDaaPergerakanGaris{
	static int jumlahPergerakan= 0;
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		System.out.print("Masukkan panjang deret: ");
		int x= xx.nextInt();
		int [] deret=  new int[x];
		
		for(int i=0; i<x; i++){
			System.out.print("Baris ke-"+(i+1)+": ");
			deret[i]= xx.nextInt();
		}
		
		mengurutkan(deret);
		//System.out.print("Pengurutan yang benar: ");
		//for(int i=0; i<x; i++)System.out.print(deret[i]+" ");
		System.out.println("Jumlah Pergerakan Garis: "+jumlahPergerakan);
	}
	
	public static void mengurutkan(int[] a) {
		boolean terurut = false;
		int temp;
		while(!terurut) {
			terurut= true;
			for (int i=0; i<a.length-1; i++) {
				if (a[i]>a[i+1]) {
					jumlahPergerakan++;
					temp= a[i];
					a[i]= a[i+1];
					a[i+1]= temp;
					terurut= false;
				}
			}
		}
	}
	
}