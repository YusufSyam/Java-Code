import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Modulb8no3{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileWriter fileBaru= null;
		
		System.out.println("1. Tambah Data");
		System.out.println("2. Tampilkan Data Mahasiswa");
		System.out.println("3. Tampilkan Info Mahasiswa");
		
		int pilihan= xx.nextInt();
		
		ArrayList<String> nim = new ArrayList<>();
		ArrayList<String> nama = new ArrayList<>();
		ArrayList<String> usia = new ArrayList<>();
		ArrayList<String> status = new ArrayList<>();
		
		try{
			
		switch pilihan{
			
			case 1:
		
		for(int i=0; i<jumlahOrang; i++){
			nama[i]= xx.next();
			nim[i]= xx.next();
			angkatan[i]= xx.next();
		}
		
		int ada;

		}
		
		fileBaru= new FileOutputStream(namaFile+".txt");
		while((ada= isi.read())!= -1){
				fileBaru.write(isi);
		}
		}catch(IOException ioe){
			System.out.println("Gagal");
		}finally{
			try{
				if(fileBaru!= null){
					fileBaru.close();
				}
			}catch(IOException ioe){
				System.out.println("Gagal");
			}
		}
	}
	
}