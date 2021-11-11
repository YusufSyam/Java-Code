import java.io.*;
import java.util.Scanner;

class Modulb8no2_2{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileReader sumberFile= null;
		FileWriter tujuan= null;
		BufferedReader isiFile= null;
		
		try{
			System.out.print("Input sumber file : ");
			String namaFile1= xx.nextLine();
			sumberFile= new FileReader(namaFile1+".txt");
			isiFile= new BufferedReader(sumberFile);
			System.out.print("Input nama file baru : ");
			String namaFile2= xx.nextLine();
			tujuan= new FileWriter(namaFile2+".txt");
			String s;
			String s2= "";
			int kataTerpanjang= 0;
			
			while((s=isiFile.readLine())!=null){
				s2+=s+"\n";
			}
			
			String [] s3= s2.split("\n");
			
			for(int i=0; i<s3.length; i++){
				if(s3[i].length()>=kataTerpanjang) kataTerpanjang=s3[i].length();
			}
			
			for(int i=0; i<s3.length; i++){
				String ss= String.format("%"+kataTerpanjang+"s", s3[i]);
				tujuan.write(ss);
				tujuan.write("\n");
			}
			
		}catch(IOException ioe){
			System.out.print("Gagal");
		}finally{
			try{
				if(sumberFile!= null){
				System.out.println("Berhasil");	
				sumberFile.close();
				}
				if(tujuan!= null) tujuan.close();
			}catch(IOException ioe){
				System.out.print("Gagal");
			}
		}
	}
}