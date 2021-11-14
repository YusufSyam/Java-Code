import java.util.*;

public class Iterator {

	static Scanner xx= new Scanner(System.in);
	
	public static void main(String [] args) {
		boolean jalanTross= true;
		ArrayList <String> a= new ArrayList<>();
		
		while(jalanTross) {
			String nama= xx.next();
			if(!nama.equalsIgnoreCase("E"))a.add(nama);
			else break;
		}
		
		java.util.Iterator<String> iterasi= a.iterator();
		
		while(iterasi.hasNext()) {
			System.out.println(iterasi.next());
		}
	}
}
