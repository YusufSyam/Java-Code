import java.util.*;

public class Modus2 {
	
	static Scanner xx= new Scanner(System.in);
	public static void main(String [] args) {
		int n= xx.nextInt();
		int [] bilangan = new int[n];
		boolean kesamaan;
		ArrayList <Integer> bilanganSama= new ArrayList<>();
		bilanganSama.add(bilangan[0]= xx.nextInt());
		
			for(int i=1; i<n; i++) {
				bilangan[i]= xx.nextInt();
				kesamaan= true;
				for(int j=0; j<bilanganSama.size(); j++) {
					if(bilangan[i]==bilangan[0]) {
						kesamaan= false;
						break;
					}else if(bilangan[i]==bilanganSama.get(j)) {
						kesamaan= false;
						break;
					}else {
						kesamaan= true;
					}
				}
				if(kesamaan= true) bilanganSama.add(bilangan[i]);
			}
			
			int [] modus= new int[bilanganSama.size()];
			for(int i=0; i<n; i++) {
				for(int j=0; j<bilanganSama.size(); j++) {
					if(i==0) {
						modus[j]= 0;
					}else if(bilangan[i]==bilanganSama.get(j)) {
						modus[j]++;
					}
				}
			}
			
			int maks= 0, maksIndeks= 0;
			for(int i=0; i<modus.length; i++) {
				if(modus[i]>maks) {
					maks= modus[i];
					maksIndeks= i;
				}
			}
			System.out.println(bilanganSama.get(maksIndeks));
	}
}