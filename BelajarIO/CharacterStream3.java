import java.io.*;
import java.util.Scanner;

class CharacterStream3{
	public static void main(String [] args)throws IOException{
		Scanner xx= new Scanner(System.in);
		PrintWriter writer= null;
		try{
			System.out.print("Masukkan isi : ");
			String isiFile= xx.nextLine();
			writer= new PrintWriter("Filebaru2.txt");
			writer.println(isiFile);
		}catch(){
		}finally{
			try{
				if(writer!=null){
					writer.close();
				}
			}catch (IOException ioe){
				System.out.println(ioe.getMessage());
			}
			}
		}
	}