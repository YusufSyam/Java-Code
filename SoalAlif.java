import java.util.Scanner;

public class SoalAlif {
	
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		int banyakSiswa= xx.nextInt();
		int banyakSubjek= xx.nextInt();
		char [][] hasil= new char[banyakSiswa][];
		
			for(int i=0; i<banyakSiswa; i++) {
				String nilai= xx.next();
				hasil[i]= nilai.toCharArray();
			}
		
		int maks= 0;
		int [] indeksMaks= new int[3];
		
			for(int i=0; i<banyakSiswa; i++) {
				for(int j=i+1; j<banyakSiswa; j++) {
					for(int k=j+1; k<banyakSiswa; k++) {
						int a= periksaJawaban(hasil[i], hasil[j], hasil[k], banyakSubjek) ;
						if(a>maks) {
							maks= a;
							indeksMaks[0]= i; indeksMaks[1]= j; indeksMaks[2]= k;
					}
					}
					}
					}
		
		System.out.println("Kelompok terbaik= siswa "+indeksMaks[0]+", "+indeksMaks[1]+" dan "+indeksMaks[2]+". ("+maks+") subjek lulus");
	}
	
	static int periksaJawaban(char [] hasil1, char [] hasil2, char [] hasil3, int banyakSubjek) {
		int subjekLulus= 0;
		for(int i=0; i<banyakSubjek; i++) {
			if((hasil1[i] | hasil2[i] | hasil3[i])=='1') subjekLulus++;
		}
		return subjekLulus;
		}
}
