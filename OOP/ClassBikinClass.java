import java.util.Scanner;
import java.io.*;

public class ClassBikinClass {
	
	public static void main(String [] args) throws IOException{
		Scanner xx= new Scanner(System.in);
		FileWriter file= null;
		PrintWriter isiFile= null;
		
		System.out.print("Nama class : ");
		String namaFile= xx.next();
		file= new FileWriter(namaFile+".java");
		
		isiFile= new PrintWriter(file);
		isiFile.write("import java.util.Scanner;\npublic class "+namaFile+" {\n");
		
		isiFile.write("\n\tpublic static void main(String [] args){\n}\n}");
		
		if(isiFile!= null) isiFile.close();
		if(file!= null) file.close();
		
		
	}
	
}
