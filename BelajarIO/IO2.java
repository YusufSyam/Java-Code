import java.io.*;
import java.util.Scanner;

class IO2{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileReader pencariFile= null;
		BufferedReader pembacaIsiFile= null;
		try{
			System.out.print("Masukkan file yang ingin dibaca (beserta ekstensinya) : ");
			String namaFile= xx.nextLine();
			pencariFile= new FileReader(namaFile);			
			pembacaIsiFile= new BufferedReader(pencariFile);
			String s;
			while((s= pembacaIsiFile.readLine())!= null){
				System.out.print(s);
			}
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}finally{
			try{
				if(pembacaIsiFile!= null){
					pembacaIsiFile.close();
				}
				if(pencariFile!= null){
					pencariFile.close();
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
		}
	}
}