import java.util.Scanner;

public class Modulb6no2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		String input= xx.nextLine();
		String kode= "";
		int i, j, k, indeks= 0;
				
		for(i=0; i<input.length(); i++) {
			kode+= input.substring(i, i+1);
			if(i+1==input.length()) break;
			i++;
			kode+= Integer.toString(Character.codePointAt(input, i));
			
		}
		
		int blok= (kode.length()/16)+1;
		for(i=kode.length(); i<=blok*16; i++) kode+="?";
		char [] kodePerKarakter= kode.toCharArray();
		
		for(i= 0; i<4; i++) {
			for(j= 0; j<4; j++) {
				for(k= 0; k<blok; k++) {
					System.out.print(kodePerKarakter[indeks]);
					indeks++;
				}
				System.out.print("   ");
			}
		System.out.println();
		}
		}
		}
