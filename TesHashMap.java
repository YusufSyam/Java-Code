import java.util.HashMap;
import java.util.ArrayList;
import java.nio.*;

public class TesHashMap {
	public static void main(String [] args) {
		
		HashMap <String,String> mapp2= new HashMap<>();
		
		mapp2.put("a", "b");
		mapp2.put("a", mapp2.get("a")+"c");
	
		if(!mapp2.containsKey("v")) {
			mapp2.put("v","f");
		}else mapp2.put("v",mapp2.get("v")+"c");
		
//		System.out.println(mapp2.get("a"));
//		System.out.println(mapp2.get("v"));
		
		
		///////////////////////////////////////////
		
		ArrayList <String> rayl= new ArrayList<>();
		rayl.add("a");
		rayl.add("b");
		
		ArrayList<String> logPerTanggal= new ArrayList<>();
		
		HashMap <String,ArrayList> mapp= new HashMap<>();
		mapp.put("a",rayl);
		logPerTanggal.add("a");
		
		for(int i=0; i<mapp.get("a").size(); i++) {
			System.out.println(mapp.get("a").get(i));
		}
		
		rayl.add("c");
		rayl.add("d");
		
		int hapus= 0;
		for(int i=0; i<rayl.size(); i++) {
			if(rayl.contains(mapp.get(logPerTanggal.get(logPerTanggal.size()-1)).get(hapus))) {
				rayl.remove(hapus);
				hapus--;
			}
			hapus++;
		}
		
		
		mapp.put("r", rayl);
		logPerTanggal.add("r");
		
		for(int i=0; i<mapp.get("r").size(); i++) {
			System.out.println("ini r "+mapp.get("r").get(i));
		}
		
		for(int i=0; i<mapp.get("a").size(); i++) {
			System.out.println("ini a "+mapp.get("a").get(i));
		}
		System.out.println(logPerTanggal.get(0));
		
		logPerTanggal= null;
		System.out.println("SESUDAH NULL");
		logPerTanggal= new ArrayList<>();
		logPerTanggal.add("a");
		System.out.println(logPerTanggal.get(0));
	}
}
