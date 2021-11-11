import java.io.*;
import java.util.Scanner;

public class Modulb8no3{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileWriter file= null;
		PrintWriter isiFile= null;
		
		try{
		System.out.print("Nama file : ");
		String namaFile= xx.nextLine();
		file= new FileWriter(namaFile+".txt");
		System.out.print("Jumlah orang : ");
		int jumlahOrang= xx.nextInt();
		String [] nama= new String[jumlahOrang];
		String [] nim= new String[jumlahOrang];
		String [] angkatan= new String[jumlahOrang];
		for(int i=0; i<jumlahOrang; i++){
			System.out.print("Nama : ");
			nama[i]= xx.next();
			System.out.print("Nim : ");
			nim[i]= xx.next();
			System.out.print("Angkatan : ");
			angkatan[i]= xx.next();
		}
		
		isiFile= new PrintWriter(namaFile+".txt");
		
		int ada;
		String isi= "";
		
		isiFile.write("+---------------------------+------------------+---------------+\n");
		isiFile.write("|  Nama                     |  NIM             |  Angkatan     |\n");
		isiFile.write("+---------------------------+------------------+---------------+\n");
		
		int [] panjangNama= new int[jumlahOrang]; 
		int [] panjangNim= new int[jumlahOrang]; 
		int [] panjangAngkatan= new int[jumlahOrang];
		
		for(int i=0; i<jumlahOrang; i++){
			
			panjangNama[i]= 20;
			panjangNim[i]= 10;
			panjangAngkatan[i]= 4;
			
			if(nama[i].length()<=panjangNama[i])panjangNama[i]=nama[i].length();
			if(nim[i].length()<=panjangNim[i]) panjangNim[i]=nim[i].length();
			if(angkatan[i].length()<=panjangAngkatan[i]) panjangAngkatan[i]=angkatan[i].length();
			
			nama[i]= nama[i].replaceAll("_", " ");
		}
		
		
		for(int i=0; i<jumlahOrang; i++){
		
		isiFile.write(String.format("|  %-20s     |  %-10s      |  %-4s         |\n", (nama[i].substring(0,panjangNama[i])), (nim[i].substring(0,panjangNim[i])), (angkatan[i].substring(0,panjangAngkatan[i]))));
			
		}
		
		isiFile.write("+---------------------------+------------------+---------------+\n");
		
		}catch(IOException ioe){
			System.out.println("Gagal");
		}finally{
			try{
				if(isiFile!= null){
					System.out.println("Berhasil");
					isiFile.close();
				}
				if(file!= null){
					file.close();
				}
			}catch(IOException ioe){
				System.out.println("Gagal");
			}
		}
		
	}
	
}