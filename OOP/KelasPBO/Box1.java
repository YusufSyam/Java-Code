package KelasPBO;

import java.util.Scanner;

public class Box1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		Box box1= new Box();
		
		System.out.print("Masukkan Nama      : ");
		box1.getName(xx.next());
		
		System.out.print("Masukkan Tinggi    : ");
		box1.getHeight(xx.nextDouble());
		
		System.out.print("Masukkan Lebar     : ");
		box1.getWidth(xx.nextDouble());
		
		System.out.print("Masukkan Kedalaman : ");
		box1.getDepth(xx.nextDouble());
		
		box1.desc();
		xx.close();
		
		// box1= new Box("nama");
	}
}
