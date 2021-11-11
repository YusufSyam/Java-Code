import java.util.Scanner;
import java.util.ArrayList; 
import java.math.BigInteger; 

public class AkarPrimitif {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String operasi;
		int n;
		ArrayList<BigInteger> grup= new ArrayList<BigInteger>();
			n= xx.nextInt();
		
		System.out.println("<-> Program mencari akar Primitif dari grup prima <->");
		BigInteger nModulo = new BigInteger(n+"");
		
		
		while (true){
			System.out.print("Masukkan operasi: * atau + : ");
			operasi= xx.next();
			
			if(operasi.equals("+")||operasi.equals("*")) break;
			System.out.print("Input salah, ");
		}
		
		//Cari anggota grup
		if(operasi.equals("+")){
			for(int i=0; i<n; i++)grup.add(new BigInteger(i+""));
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
				if(relatifPrima || i==1)grup.add(new BigInteger(i+""));
			}
		}
		
		System.out.println("Anggota grup Z"+n+operasi+"	: "+anggotaGrup(grup));
		System.out.println("Orde			: "+grup.size());
		
		// //Cari akar Primitif 
		// boolean [] samaAnggota= new boolean [grup.size()];
		// ArrayList <BigInteger> akarPrimitif=  new ArrayList<BigInteger>();
		// for(int i=0; i<grup.size(); i++){
		// 	for(int o=0; o<grup.size(); o++) samaAnggota[o]=false;
		// 	for(int j=1; j<=grup.size(); j++){
		// 		for(int k=0; k<grup.size(); k++){
		// 			BigInteger jKali= new BigInteger(j+""); 
		// 			//System.out.println("Angka = "+grup.get(i)+" , pangkat "+j+" modulo "+nModulo+" = "+(grup.get(i).pow(j)).mod(nModulo));
		// 			if(operasi.equals("*") ? ((grup.get(i).pow(j)).mod(nModulo)).compareTo(grup.get(k))==0 : ((grup.get(i).multiply(jKali)).mod(nModulo)).compareTo(grup.get(k))==0){
		// 				samaAnggota[k]= true;
		// 				break;
		// 			}
		// 		}
		// 	}
		// 	for(int l=0; l<grup.size(); l++){
		// 		if(samaAnggota[l]==false) break;
		// 		if(l==grup.size()-1 && samaAnggota[l]==true){
		// 			akarPrimitif.add(grup.get(i));
		// 		}
		// 	}
		// }
		
		// 	String operasi2= operasi.equals("*")? "^" : "*";
		// for(int i=0; i<grup.size(); i++){
		// 			System.out.println("\n- Untuk "+grup.get(i)+":");
		// 			for(int j=0; j<grup.size(); j++) {
					
		// 			BigInteger jKali= new BigInteger(j+""); 	
		// 			System.out.println("\t"+grup.get(i)+operasi2+j+"\t %\t"+n+" = "+/*(operasi.equals("*")? (*/(grup.get(i).pow(j)).mod(nModulo)/*) : ((grup.get(i).multiply(jKali)).mod(nModulo)))*/);
		// 			}
		// 		}
		// if(akarPrimitif.size()>0){
		// 	System.out.print("\nDidapat Akar Primitif dari Z"+n+""+operasi+" berorde "+akarPrimitif.size()+" : ");
		// 	for(int i=0; i<akarPrimitif.size(); i++){
		// 		System.out.print(akarPrimitif.get(i)); 
		// 		if(i<=akarPrimitif.size()-3) System.out.print(", ");
		// 		if(i==akarPrimitif.size()-2) System.out.print(" dan ");
		// 	}
		// 	//String operasi2= operasi.equals("*")? "^" : "*";
		// 	System.out.print("\nApakah anda ingin menampilkan (a"+operasi2+"k) mod n ? (y/n) : "); 
		// 	if(xx.next().equals("y")){
		// 		System.out.print("\nKarena: ");
		// 		for(int i=0; i<akarPrimitif.size(); i++){
		// 			System.out.println("\n- Untuk "+akarPrimitif.get(i)+":");
		// 			for(int j=0; j<grup.size(); j++) {
					
		// 			BigInteger jKali= new BigInteger(j+""); 	
		// 			System.out.println("\t"+akarPrimitif.get(i)+operasi2+j+"\t %\t"+n+" = "+(operasi.equals("*")? ((akarPrimitif.get(i).pow(j)).mod(nModulo)) : ((grup.get(i).multiply(jKali)).mod(nModulo))));
		// 			}
		// 		}
		// 	}
		// }else System.out.print("Z"+n+operasi+" Tidak memiliki akar primitif");
	}
	
	public static boolean isPrime(int prime){
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
