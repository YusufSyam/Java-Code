import java.util.*;

public class NilaiTerkecil {
	
	static Scanner xx= new Scanner(System.in);
	public static void main(String [] args) {
		int n= xx.nextInt();
		String [] siswa= new String[n];
		double [] nilaiSiswa= new double[n];
		
			for(int i=0; i<n; i++) {
				siswa[i]= xx.next();
				nilaiSiswa[i]= xx.nextDouble();
				if(nilaiSiswa[i]>100) nilaiSiswa[i]= 100;
			}
			
		double [] nilaiTerkecil= {100, 100};
		int [] indeksNilai= new int[2];
		
			for(int i=0; i<n; i++) {
				if(nilaiSiswa[i]<nilaiTerkecil[0]){
					nilaiTerkecil[0]= nilaiSiswa[i];
					indeksNilai[0]= i;
				}
				}
			
			for(int i=0; i<n; i++) {
				if(nilaiSiswa[i]<nilaiTerkecil[1] && i!=indeksNilai[0]){
					nilaiTerkecil[1]= nilaiSiswa[i];
					indeksNilai[1]= i;
				}
				}
			
		System.out.println(siswa[indeksNilai[0]]+"\n"+siswa[indeksNilai[1]]);
	}
	}
