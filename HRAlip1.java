import java.util.Scanner;
import java.util.ArrayList;

public class HRAlip1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		ArrayList <Integer> alice= new ArrayList<>();
		ArrayList <Integer> bob= new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			int n= xx.nextInt();
			alice.add(n);
		}
		
		for(int i=0; i<3; i++) {
			int n= xx.nextInt();
			bob.add(n);
		}
		
		System.out.println(hasil(alice, bob));
	}
	
	public static ArrayList hasil(ArrayList <Integer> a, ArrayList <Integer> b) {
		ArrayList <Integer> x= new ArrayList<>(); x.add(0); x.add(0);
		for(int i=0; i<3; i++) {
			a.get(i)>b.get(i)? x.add(0, x.get(0)+1) : x.add(1, x.get(1)+1);
		}
		return x;
	}
}
