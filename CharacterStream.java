import java.io.*;

class CharacterStream{
	public static void main(String [] args){
		FileWriter file= null;
		PrintWriter writer= null;
		try{
			file= new FileWriter("source.txt");
			writer= new PrintWriter(file);
			String s= "lorem ipsum dolor sit amet";
			writer.println(s);
		}catch (IOException ioe){
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