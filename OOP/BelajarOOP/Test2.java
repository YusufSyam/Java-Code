package BelajarOOP;
import BelajarOOP.Scan;
import java.util.ArrayList;

public class Test2 {
	public static void main(String [] args) {
		for (int i=0; i<5; i++) {
			BikinVar();
		}
		
		for(int i=0; i<5; i++) {
			Print.Jingln(a.get(i));
		}
	}
	
	static String BikinVar() {
		String b= "";
		b= Scan.String();
		a.add(b);
		banyakVar++;
		return a.get(banyakVar-1);
	}
	
	static int banyakVar= 0;
	static ArrayList <String> a= new ArrayList<>();
}
