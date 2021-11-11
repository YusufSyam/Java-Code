package KelasPBO;

public class ObjekTPS1 {
	public static void main(String [] args) {
		TPS1 objek= new TPS1();
		TPS1 objek2= new TPS1("Tes");
		objek.a= 1;
		System.out.println(objek2.b);
		System.out.println(objek.plus(2));
	}
}
