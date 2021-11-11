package BelajarOOP;

import java.util.Scanner;
import java.io.*;

public class BikinClassHewanmu {
		
		public static void main(String [] args) throws IOException{
			Scanner xx= new Scanner(System.in);
			FileWriter file= null;
			PrintWriter isiFile= null;
			
			System.out.print("Jenis Hewan : ");
			String namaFile= xx.next();
			System.out.print("Nama Hewan  : ");
			String namaHewan= xx.next();
			System.out.print("Sifat Hewan : ");
			String sifatHewan= xx.next();
			
			file= new FileWriter(namaFile+".java");
			
			isiFile= new PrintWriter(file);
			isiFile.write("package BelajarOOP;\n\npublic class "+namaFile+" {\n");
			isiFile.write("\n\tpublic static void main(String [] args){\n\n");
			isiFile.write("\t\tHewan "+namaFile+"= new Hewan();\n");
			isiFile.write("\t\t"+namaFile+".jenisHewan= \""+namaFile+"\";\n");
			isiFile.write("\t\t"+namaFile+".namaHewan= \""+namaHewan+"\";\n");
			isiFile.write("\t\t"+namaFile+".sifatHewan= \""+sifatHewan+"\";\n");
			isiFile.write("\t\t"+namaFile+".run();");
			isiFile.write("\n\n\t}\n}");
			if(isiFile!= null) isiFile.close();
			if(file!= null) file.close();
		
	}
}
