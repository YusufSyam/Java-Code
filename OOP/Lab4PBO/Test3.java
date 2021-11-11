package Lab4PBO;

import java.util.Scanner;

public class Test3 extends Test2{
	Scanner xx= new Scanner(System.in);
	
	{
		System.out.print("Masukkan A : ");
	}
	
	int a= xx.nextInt();
	
	int getA(){return a;}
	{
		System.out.println("Ini super");
		System.out.println("Tes3");
		super.print();	
	}
	
	Test3(){
		super();
		System.out.println("Ini super2");
		System.out.println("Tes32");
		super.print();
		
	}
	
	

	
//	void oi() {
//		super();
//	}
}
