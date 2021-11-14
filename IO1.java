import java.io.*;

class IO1{
	public static void main(String [] args){
		FileInputStream in= null;
		FileOutputStream out= null;
		try{
			in= new FileInputStream("input.txt");
			out= new FileOutputStream("output.txt");
			int data;
			while((data= in.read())!= -1){
				out.write(data);
			}
		}catch (IOException ioe){
			System.out.println(ioe.getMessage());
		}finally{
			try{
				if(in != null){
					in.close();
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