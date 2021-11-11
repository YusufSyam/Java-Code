import java.io.*;
import java.util.Scanner;

class IO1{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		FileInputStream in= null;
		FileOutputStream out= null;
		try{
			System.out.print("Input file yang ingin dicopy : ");
			String Fileyangingindicopy= xx.next();
			System.out.print("Format : ");
			String format1= xx.next();
			System.out.print("Input nama filenya : ");
			String namaFile= xx.next();
			System.out.print("Format : ");
			String format2= xx.next();
			in= new FileInputStream(Fileyangingindicopy+"."+format1);
			out= new FileOutputStream(namaFile+"."+format2);
			int data;
			while((data= in.read())!= -1){
				out.write(data);
			}
		}catch (IOException ioe){
			System.out.println(ioe.getMessage());
		}finally{
			try{
				if(in != null){
					System.out.println("Berhasil");
					in.close();
				}else{
					System.out.println("Gagal");
				}
				if(out!= null){
					out.close();
				}
		} catch (IOException ioe){
			System.out.println(ioe.getMessage());
		}
		}
	}
}