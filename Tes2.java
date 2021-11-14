import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Tes2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int a= 10;
		int b= 1;
		System.out.println(a==10 && b==1);
		System.out.println((a&b)==10);
		
		HashMap <Integer, Integer> c= new HashMap<>();
		System.out.println(c.size());
		c.put(1, 2);
		c.put(1, c.get(1)*2);
		c.put(100, 4);
		c.put(101, 5);
		System.out.println(c.get(1));
		System.out.println(c.size());
		
		HashMap <Integer, String> uwau= new HashMap<>();
		uwau.put(1, "Uwau");
		uwau.put(2, "Uwau2");
		
		for(int i=1; i<=uwau.size(); i++) {
			System.out.println(uwau.get(i));
		}
		
		uwau.put(uwau.size()+1, xx.next()+" apa bede "+xx.next());
		
		for(int i=1; i<=uwau.size(); i++) {
			System.out.println(uwau.get(i));
		}
		
		ArrayList <String> aab= new ArrayList<>();
		aab.add("Wawo");
		aab.add("Wawo1");
		aab.add("Wawo2");
		aab.add(2, "Wawo3");
		for (int i=0; i<aab.size(); i++){
			System.out.println(i+". "+aab.get(i));
		}
		
		aab.remove(2);
		
		for (int i=0; i<aab.size(); i++){
			System.out.println(i+". "+aab.get(i));
		}
		
		System.out.println(aab.size());
	}
}
