import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class JavaNio {
	public static void main(String [] args) throws Exception{
		Scanner xx= new Scanner(System.in);
		
		//baca file
		String data = Files.readString(Path.of("jajajajaja.txt"));
		 System.out.println(data.equals(""));
		
		//tulis file
		String a= xx.next();
		Files.writeString(Path.of("jajajajaja.txt"), String.format("%s#-;string#-;%d#-; integer","s",4));
		
		data= Files.readString(Path.of("jajajajaja.txt"));
		
       
	}
}
