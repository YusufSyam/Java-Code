import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class DatabaseDenganIO{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileReader sumberFile= null;
		BufferedReader pembacaFile= null;
		PrintWriter penulisIsiFile= null;
		
		try{
			sumberFile= new FileReader("Database1.txt");
			pembacaFile= new BufferedReader(sumberFile);
				
			String baca;
			ArrayList <String> isi= new ArrayList<>();
			
			while((baca= pembacaFile.readLine())!= null){
				isi.add(baca);
			}
			
			penulisIsiFile= new PrintWriter("Database1.txt");
			
			boolean jalanTross= true;
			
			while(jalanTross==true){

			System.out.print("<><>====<>====<>>Data mahasiswa<<>====<>====<><>\n   1. Tampilkan data mahasiswa\n   2. Tambah data mahasiswa\n   3. Hapus data mahasiswa\n  (s) Selesai\n<><>====<>====<><>====<><>====<><>====<>====<><>\n>> ");
			
			String pilihOpsi= xx.next();	  
			String [][] data= new String [isi.size()][4];
			switch (pilihOpsi){
				case "1" :
					System.out.print("\n<><>===<>==<>>Pilih data mahasiswa<<>==<>===<><>\n");
					for(int i= 0; i<isi.size(); i++){
						data[i]= isi.get(i).split(";");
						System.out.println("  "+(i+1)+". "+data[i][0]);
					}
					
					System.out.print("<><>====<>====<><>====<><>====<><>====<>====<><>\n>> ");
					int pilihData= xx.nextInt();
					
					System.out.print("<><>====<>====<>>Data mahasiswa<<>====<>====<><>\n");
					if(pilihData<=isi.size()){
							System.out.println(tampilData(data[pilihData-1][0],data[pilihData-1][1],data[pilihData-1][2],data[pilihData-1][3]));
					}
					System.out.print("<><>====<>====<><>====<><>====<><>====<>====<><>\n");
					break;
					
				case "2" : 
					System.out.print("Nama\t: ");
						String nama= xx.next();
					System.out.print("Umur\t: ");
						String umur= xx.next();
					System.out.print("Status\t: ");
						String status= xx.next();
					System.out.print("Sifat\t: ");
						String sifat= xx.next();
					isi.add(nama+";"+umur+";"+status+";"+sifat+";");
					break;
				
				case "3" :
				
					System.out.print("\n<><>===<>>Pilih data yang akan dihapus<<>===<><>\n");
						for(int i= 0; i<isi.size(); i++){
						data[i]= isi.get(i).split(";");
						System.out.println("  "+(i+1)+". "+data[i][0]);
						}
					System.out.print("<><>====<>====<><>====<><>====<><>====<>====<><>\n>> ");
					int hapusData= xx.nextInt();
					
					if(hapusData<=isi.size())isi.remove(hapusData-1);
					break;
				
				case "s" : 
					for(int i= 0; i<isi.size(); i++){
						penulisIsiFile.write(isi.get(i)+"\n");
					}
					return;
			}
				System.out.println();
			}
			
			
		}catch(IOException ioen){
			System.out.println("Gagal");
		}finally{
			try{
				if(pembacaFile!=null) pembacaFile.close();
				if(sumberFile!=null) sumberFile.close();
				if(penulisIsiFile!=null) penulisIsiFile.close();
			}catch(IOException ioex){
				System.out.println("Gagal");
			}
		}
	}
	
	public static String tampilData(String a,String b,String c,String d){
		return 	"Nama\t : "+a+
				"\nUmur\t : "+b+
				"\nStatus\t : "+c+
				"\nSifat\t : "+d;
	}
	
}