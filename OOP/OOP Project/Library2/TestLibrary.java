import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

class TestLibrary{
	public static void main(String [] args)throws IOException{
		Scanner xx= new Scanner(System.in);
		String a= xx.next();
		
		String [] bacaData= Files.readString(Path.of("Daftar Member.txt")).split("###");
		
		for(int i=0; i< bacaData.length; i++){	
			String [] bacaMember= bacaData[i].split("#-;");

			if(bacaMember[0].equals(a)) System.out.println("BERHASIL!");
		}
		
		int ew= 0;
		for(int i=0; i<ew; i++){
			System.out.println("ew");
		}
		
		String assaa= null;
		if(assaa==null) System.out.println("MULL");
/*		
		String [] bacaLog= bacaMember[2].split("#-#");
		String [] bacaBukuDipinjam= bacaMember[3].split("#-#");
		
		for(int i=0; i<2; i++){
			System.out.println(i+". "+bacaMember[i]);
		}
	
		for(int i=0; i<bacaLog.length; i++){
			if(i%2==0) System.out.println("Tanggal : "+bacaLog[i]);
			else System.out.println("Log : "+bacaLog[i]);
		}
		
		for(int i=0; i<bacaBukuDipinjam.length; i++){
			if(i%2==0) System.out.println("Buku : "+bacaBukuDipinjam[i]);
			else System.out.println("Tanggal : "+bacaBukuDipinjam[i]);
		}
	*/
	}
}