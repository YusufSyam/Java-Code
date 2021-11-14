import java.util.ArrayList;

public class TesSplit {
	static ArrayList <String> asasa= new ArrayList<>();
	public static void main(String [] args) {
		asasa= new ArrayList<>();
		asasa= null;
		asasa= new ArrayList<>();
		String a= "aaa#-;bbb#-;ccc#-#re#-#uiui#-#opopop#-;lksaklasklas#-;narnia##-#-;";
		
		String [] b= a.split("#-;");
		ArrayList<String> c= new ArrayList<>();
		String [] d= b[2].split("#-#");
		String [] e= b[4].split("##-");
		System.out.println(e.length);
		
		for(int i=0; i<d.length; i++) {
			if(i%2==0) {
				c.add(d[i]);
				System.out.println("ADD KEY"+d[i]);
			}else {
				c.add(d[i]);
				System.out.println("ADD VALUE"+d[i]);
			}
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i]);
		}
		
		for(int i=0; i<d.length; i++) {
			if(i%2==0) {
				System.out.println("%2"+d[i]);
			}else {
				System.out.println("%1"+d[i]);
			}
			
		}
	
		
	}
}
