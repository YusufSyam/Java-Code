
public class CharTambahAngka {
	public static void main(String [] args) {
		int n= 0;
		String kata= Integer.toString(n);
		char [] huruf= new char [kata.length()];
		for(int i=0; i<huruf.length; i++) {
			huruf[i]= kata.charAt(i);
			System.out.println(huruf[i]);
		}

		int nbaru=0;
		for(int b : huruf) {
			nbaru=b-48;
			System.out.println(nbaru);
			if(n%nbaru == 0) {
				System.out.println(n+" bisa dibagi dengan "+nbaru);
			}else {
				System.out.println(n+" tidak bisa dibagi dengan "+nbaru);

			}
		}
	}
}
