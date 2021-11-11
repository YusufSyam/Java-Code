import java.util.Scanner; 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.math.BigInteger; 

public class AkarPrimitifPrime {
	 
	static HashSet<Integer> HSpembagiAnggota= new HashSet<Integer>();
	static List<Integer> ALpembagiAnggota;
	
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String operasi;
		int n;
		ArrayList<BigInteger> grup= new ArrayList<BigInteger>();
		
		System.out.print("Masukkan n -> (Zn): ");
		n= xx.nextInt();
		BigInteger nBI= new BigInteger(""+n);
		
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
		
		System.out.println("Jadi, Anggota dari grup Z"+n+""+operasi+"= "+anggotaGrup(grup));

		setPrimeDanPasangannya(n);
		
		//Akar Primitif  
		ArrayList <Integer> akarPrimitif=  new ArrayList<>();
		boolean benarAP= true;
		for(int i=0; i<grup.size(); i++){
			benarAP= true;
			for(int j=0; j<ALpembagiAnggota.size(); j++){
				System.out.println("Grup = "+grup.get(i)+" pangkat "+ALpembagiAnggota.get(j)+" % "+n+" = "+(Math.pow(grup.get(i),ALpembagiAnggota.get(j)))%n);
				if(((Math.pow(grup.get(i),ALpembagiAnggota.get(j)))%n)==1){
					benarAP= false;
					break; 
				}
			}
			if(benarAP) akarPrimitif.add(grup.get(i));
		}
		
		System.out.print(ALpembagiAnggota);
		System.out.print(akarPrimitif.size());
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
	
	static void setPrimeDanPasangannya(int prima){
		prima-= 1;
		int pembagi= 2;
		int primaTemp= prima;
		
		while(true){
			if(primaTemp%pembagi==0){ 
				HSpembagiAnggota.add(prima/pembagi);
				primaTemp/= pembagi; 
				pembagi=2;
			}if(primaTemp%pembagi!=0){
				pembagi++;
			}if((isPrime(primaTemp))){ 
				HSpembagiAnggota.add(prima/primaTemp);
				break;
			}
		}
		ALpembagiAnggota= new ArrayList<Integer>(HSpembagiAnggota);
	}
	
	static boolean isPrime(int prime){
		for(int i=2; i<(prime/2)+1; i++){
			if(prime%i==0) return false;
		}
		return true;
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
