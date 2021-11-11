import java.io.*;

class IOPraktikum{
	public static void main(String [] args){
		
		//ByteStream
		FileInputStream inputStream= null;
		FileOutputStream outputStream= null;
		
		//CharacterStream
		FileReader fileReader= null;
		FileWriter fileWriter= null;
		
		try{
		inputStream= new FileInputStream("input.txt");
		outputStream= new FileOutputStream("output6.txt");
				
		fileReader= new FileReader("input.txt");
		fileWriter= new FileWriter("output7.txt");
		
		for(int i= inputStream.read(); i!=-1; i=inputStream.read()){
			System.out.print((char)i);
			outputStream.write(i);
		}
		
		for(int i= fileReader.read(); i!=-1; i=fileReader.read()){
			System.out.print((char)i);
			fileWriter.write(i);
		}
	
	
	
		}catch(IOException ioe){
			System.out.println("Salah");
		}finally{
			try{
				if(inputStream!=null){
					inputStream.close();
				}
				if(outputStream!=null){
					outputStream.close();
				}
				if(fileReader!=null){
					fileReader.close();
				}
				if(fileWriter!=null){
					fileWriter.close();
				}
			}catch(IOException ioe){
				System.out.println("Salah");
			}
			
		}
	
	
	}
}