package Lab4PBO;

public class Test4 extends Test3{
	static int m= 1111;
	static {
		m= m+=1;
		System.out.println(m);
	}
		
	public static void main(String [] args) {
		Test3 tes= new Test3();
		int b= tes.a;
		System.out.println("INI A : "+tes.a);
		int r= m-- + --m;
		System.out.println(r);
	}
}
