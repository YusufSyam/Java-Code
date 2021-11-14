import java.util.*;

public class Stack {
	
	static Scanner xx= new Scanner(System.in);
	static String a= xx.nextLine();
	static char [] aKode= a.toCharArray();
	static String [] aKode2= new String[aKode.length];
	static {
		for(int j=0; j<aKode.length; j++) {
			aKode2[j]= ""; 
			aKode2[j]+=aKode[j];
		}
	}
	
	public static void main(String [] args) {

		boolean rata= true;
		for(int i=0; i<aKode.length; i++) {
			rata= balance(i, aKode.length, aKode2[i]);
			if(rata==true && iterasi==i) i++;
			if(rata==false) break;
		}
		System.out.println(rata);
	}
	
	static int iterasi;
	
	public static boolean balance(int a, int b, String c) {
		String pasangan= "";
		if(c.equals("(")) pasangan= ")"; 
		if(c.equals("[")) pasangan= "]";
		if(c.equals("{")) pasangan= "}";
		for(int i=a; i<b; i++) {
			if(aKode2[i].equals(pasangan)) iterasi= i; return true;
		}
		return false;
	}
	
	
}
