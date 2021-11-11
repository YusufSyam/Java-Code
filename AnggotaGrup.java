import java.util.Scanner;
import java.util.ArrayList;

public class AnggotaGrup {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String operasi;
		int n;
		ArrayList<Integer> grup= new ArrayList<>();
		
		System.out.print("Masukkan n -> (Zn): ");
		n= xx.nextInt();
		
		
		while (true){
			System.out.print("Masukkan operasi: * atau + : ");
			operasi= xx.next();
			
			if(operasi.equals("+")||operasi.equals("*")) break;
			else System.out.print("Input salah, ");
		}
		
		if(operasi.equals("+")){
			for(int i=0; i<n; i++){
				grup.add(i);
			}
		}else{
			ArrayList<Integer> faktor= new ArrayList<>();
			for(int i=1; i<n; i++){
				if(n%i==0 && i>1) faktor.add(i);
			}
			
			for(int i=1; i<n; i++){
				boolean relatifPrima= true;
				for(int j=0; j<faktor.size(); j++){
					if(i%faktor.get(j)==0) relatifPrima= false;
				}
				if(relatifPrima || i==1)grup.add(i);
			}
		}
		
		System.out.println("Jadi, Anggota dari grup Z"+n+""+operasi+"="+anggotaGrup(grup));
		
	}
	
	static String anggotaGrup(ArrayList grup){
		String anggota= "{ ";
		for(int i=0; i< grup.size(); i++){
			anggota+=grup.get(i);
			if(i<grup.size()-1)anggota+=", ";
		}
		anggota+=" }";
		return anggota;
	}
}
