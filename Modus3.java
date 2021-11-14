import java.util.*;

public class Modus3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int n= xx.nextInt();
		int [] data= new int[n];
		ArrayList <Integer> angkaSama= new ArrayList<>();
		boolean kesamaan;
		if(n>0) angkaSama.add(data[0]= xx.nextInt());
		for(int i=1; i<n; i++) {
			data[i]= xx.nextInt();
			kesamaan= true;
			for(int j=0; j<angkaSama.size(); j++) {
				if(data[i]== data[0] || data[i]== angkaSama.get(j)) {
					kesamaan= false;
					break;
				}
			}
			if(kesamaan==true) angkaSama.add(data[i]);
		}
		
		int [] modus= new int[angkaSama.size()];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<modus.length; j++) {
				if(i==0) {
					modus[j]=0;
				}
				if(data[i]==angkaSama.get(j)) {
					modus[j]++;
				}
			}
		}
		int maks=0, maksIndeks=0, maksModus=0;
		for(int i=0; i<modus.length; i++) {
			if(modus[i]>=maks && angkaSama.get(i)>=maksModus) {
				maks= modus[i];
				maksIndeks= i;
				maksModus= angkaSama.get(i);
			}
		}
		System.out.println(angkaSama.get(maksIndeks));
	}
}
