package Assignment02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DataSource {
	
	private static DataSource dataSource;
	private HashMap <String , User> userMap= new HashMap<>();
	private HashMap <Integer , UserDetail> userDetailMap= new HashMap<>();
	
	private DataSource() {
		try {
			putUserDetail();
			putUser();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	 public static DataSource getInstance() {
		 if (dataSource == null) { dataSource = new DataSource(); }
		 return dataSource;
	 }
	
	private void putUserDetail() throws IOException{
		
		BufferedReader pembacaFile= new BufferedReader(new FileReader("UserDetail.txt"));	
		String baca[]= new String[4];	
		while((baca= pembacaFile.readLine().split(";"))!= null){
			userDetailMap.put(keInt(baca[0]), new UserDetail(keInt(baca[0]), baca[1], baca[2], baca[3]));
		}
		
		baca= null;
		if(pembacaFile!=null) pembacaFile.close();
		
	}
	
	private void putUser() throws IOException{
		
		BufferedReader pembacaFile= new BufferedReader(new FileReader("User.txt"));	
		String baca[]= new String[3];	
		while((baca= pembacaFile.readLine().split(";"))!= null){
			userMap.put(baca[1], new User(keInt(baca[0]), baca[1], baca[2], userDetailMap.get(keInt(baca[0]))));
			System.out.println(baca[1]);
		}
		
		baca= null;
		if(pembacaFile!=null) pembacaFile.close();
		
	}
	
	public User getUser(String key) {
		return userMap.get(key);
	}
	
	public UserDetail getUserDetail(Integer key) {
		return userDetailMap.get(key);
	}

	public Integer keInt(String a) { return Integer.parseInt(a);}
	
}

