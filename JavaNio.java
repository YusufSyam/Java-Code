package ecl;

import java.nio.file.Files;
import java.nio.file.Path;

public class JavaNio {
	public static void main(String [] args) {
		
		String a= "A";
		Files.writeString(Path.of("words.txt"), a);
	}
}
