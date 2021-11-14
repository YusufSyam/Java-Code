
public class TesFormatD {
	public static void main(String [] args) {
		int b= 1;
		int c= 10;
		int d= 100;
		int e= 1000;
		
		String a2= String.format("%"+10+"d",c);
		
		System.out.println(a2);
		System.out.printf("%"+2+"d",d);
	}
}
