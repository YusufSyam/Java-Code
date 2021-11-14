
public class TestStatic {
	public static void main(String [] args) {
		int a= ini.tambah++;
		int b= ini.tambah++;
		int c= ini.tambah++;
		int d= ini.tambah++;
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
	}
}

class ini{
	static int tambah;
}
