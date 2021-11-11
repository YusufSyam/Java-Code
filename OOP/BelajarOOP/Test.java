package BelajarOOP;

public class Test {
	
	public static void main(String [] args) {
		
		P("Nama : ");
		String nama= Scan.String();
		
		P("Umur : ");
		int umur= Scan.Int();
		
		P("Peliharaan : ");
		double peliharaan= Scan.Double();
		
		P("Jadi..");
		Print.Jingln(nama, umur, peliharaan);
		
	}
	
	static void P(String abc){
		Print.Jing(abc);
	}
}
