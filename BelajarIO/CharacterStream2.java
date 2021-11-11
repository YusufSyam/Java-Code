import java.io.*;
import java.util.Scanner;

public class CharacterStream2{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		BufferedReader pembaca= null;
		PrintWriter penulis= null;
		
		try{
			pembaca= new BufferedReader("Filebaru2.txt");
			System.out.print("Masukkan isi : ");
			String isiFile= xx.nextLine();
			penulis= new PrintWriter("Filebaru2.txt");
			penulis.println(isiFile);
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}finally{
			try{
				if(pembaca!=null){
					pembaca.close();
				}
				if(penulis!=null){
					penulis.close();
				}
			}catch(IOException ioe){
			System.out.println(ioe.getMessage());
			}
		}
	}
}