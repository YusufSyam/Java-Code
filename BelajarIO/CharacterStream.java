import java.io.*;
import java.util.Scanner;

class CharacterStream{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileWriter file= null;
		PrintWriter writer= null;
		try{
			System.out.print("Masukkan nama file yang mau dibuat : ");
			String namaFile= xx.nextLine();
			System.out.print("Masukkan isi : ");
			String isiFile= xx.nextLine();
			file= new FileWriter(namaFile+".txt");
			writer= new PrintWriter(file);
			writer.println(isiFile);
		}catch (IOException ioe){
				System.out.println(ioe.getMessage());
		}finally{
			try{
				if(writer!=null){
					writer.close();
				}
				if(file!=null){
					file.close();
				}
			}catch (IOException ioe){
				System.out.println(ioe.getMessage());
			}
			}
		}
	}