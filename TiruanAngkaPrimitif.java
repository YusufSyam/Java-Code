import java.util.Scanner;
import java.util.ArrayList;

public class TiruanAngkaPrimitif {
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
		
		//Anggota grup
		if(operasi.equals("+")){
			for(int i=0; i<n; i++)grup.add(i);
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
		
		System.out.println("Anggota grup Z"+n+operasi+"	: "+anggotaGrup(grup));
		System.out.println("Orde			: "+grup.size());
		
		//Akar Primitif 
		boolean [] samaAnggota= new boolean [grup.size()];
		ArrayList <Integer> akarPrimitif=  new ArrayList<>();
		for(int i=0; i<grup.size(); i++){
			for(int o=0; o<grup.size(); o++) samaAnggota[o]=false;
			for(int j=1; j<=grup.size(); j++){
				for(int k=0; k<grup.size(); k++){
					if(operasi.equals("*") ? Math.pow(grup.get(i),j)%n==grup.get(k) : (grup.get(i)*j)%n==grup.get(k)){
						samaAnggota[k]= true;
						break;
					}
				}
			}
			for(int l=0; l<grup.size(); l++){
				if(samaAnggota[l]==false) break;
				if(l==grup.size()-1 && samaAnggota[l]==true){
					akarPrimitif.add(grup.get(i));
				}
			}
		}
		
		if(akarPrimitif.size()>0){
			System.out.print("\nDidapat Akar Primitif/Generator dari Z"+n+""+operasi+": ");
			for(int i=0; i<akarPrimitif.size(); i++){
				System.out.print(akarPrimitif.get(i)); 
				if(i<=akarPrimitif.size()-3) System.out.print(", ");
				if(i==akarPrimitif.size()-2) System.out.print(" dan ");
			}
			String operasi2= operasi.equals("*")? "^" : "*";
			System.out.print("\nApakah anda ingin menampilkan (a"+operasi2+"k) mod n ? (y/n) : ");
			if(xx.next().equals("y")){
				System.out.print("\nKarena: ");
				for(int i=0; i<akarPrimitif.size()-10; i++){
					System.out.println("\n- Untuk "+akarPrimitif.get(i)+":");
					for(int j=0; j<grup.size(); j++) System.out.println("\t"+akarPrimitif.get(i)+operasi2+j+"\t %\t"+n+" = "+(int) (operasi.equals("*")? Math.pow(akarPrimitif.get(i),j)%n : akarPrimitif.get(i)*j%n));
				}
			}
		}else System.out.print("Z"+n+operasi+" Tidak memiliki akar primitif");
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
