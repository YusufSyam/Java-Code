import java.io.*;
import java.util.Scanner;

class Modulb8no2{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileInputStream input= null;
		FileOutputStream output= null;
		
		try{
			System.out.print("Input file yang ingin dicopy : ");
			String Fileyangingindicopy= xx.next();
			System.out.print("Input nama file baru : ");
			String namaFile= xx.next();
				input= new FileInputStream(Fileyangingindicopy+".txt");
				output= new FileOutputStream(namaFile+".txt");
			int data= input.read();
			while(data!= -1){
				String rataKanan= String.format("%20d", data);
				output.write(rataKanan);
			}
		}catch (IOException xxx){
			System.out.println("Gagal");
		}finally{
			try{
				if(input != null){
					System.out.println("Berhasil");
					input.close();
				}
				if(output!= null){
					output.close();
				}
		} catch (IOException xxx){
			System.out.println("Gagal");
		}
		}
		}
		}