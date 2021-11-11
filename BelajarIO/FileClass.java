import java.io.*;

class FileClass{
	public static void main(String [] args){
		String [] dirs= {"src", "bin"};
		File file= null;
		try{
			for(String dir : dirs){
				file= new File(dir);
				file.mkdirs();
			}
			
			String paths= new File("/").list();
			for(String path : paths){
				System.out.println(path);
		} 
		}finally{
			
		}
	}
}