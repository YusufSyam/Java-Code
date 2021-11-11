package KelasPBO;

public class Main1 {
	public static void main(String [] args) {
	//	OuterClass instance= new OuterClass(); Inisialisasi biasa
	//	OuterClass.InnerClass inner= instance.new InnerClass();
	
		OuterClass i= new OuterClass(49);
		System.out.println(i.getInner());
	}
}
