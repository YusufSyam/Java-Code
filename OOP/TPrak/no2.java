import java.util.Scanner;
	class no2 {
		public static void main(String [] args) {
			Scanner x= new Scanner(System.in);
			System.out.print("Waktu (Detik) : ");
			int dtk= x.nextInt();
			int jam= (dtk/3600);
			int mnt= ((dtk-(jam*3600))/60);
			int dtkb= (dtk-(jam*3600)-(mnt*60));
		System.out.print(jam+":"+mnt+":"+dtkb);
		}

}
