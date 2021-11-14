import java.util.Scanner;

class Praktikum5no2{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		System.out.print("Input:\n1. Bangun datar\n2.Bangun ruang");
		int bangun= xx.nextInt();
		switch (bangun){
			case 1:
				System.out.println("Pilih Bangun Datar : ");
				System.out.println("1. Persegi");
				System.out.println("2. Persegi Panjang");
				System.out.println("3. Segitiga");
				System.out.println("4. Lingkaran");
				System.out.println("5. Jajar Genjang");
				System.out.println("6. Trapesium");
				System.out.println("7. Belah Ketupat");
				System.out.println("8. Layang - Layang");
				System.out.println("Input angka sesuai nomor bangun datar");
				
				int bRuang= xx.nextInt();
				
				switch(bRuang){
					case 1:
						System.out.println("Persegi");
						double lp;
						double s;
						System.out.print("Sisi = ");
						s = xx.nextDouble();
						lp = s*s;
						System.out.print("Luas = "+lp);
					break;

					case 2:
						double luasPP;
						double ppp;
						double le;
						System.out.println("Persegi Panjang");
						System.out.print("Panjang = ");
						ppp = xx.nextDouble();
						System.out.print("Lebar = ");
						le = xx.nextDouble();
						luasPP = ppp * le;
						System.out.print("Luas = "+luasPP);
					break;

						case 3:
						System.out.println("Segitiga");
						double ls;
						double as;
						double ts;
						System.out.print("Alas = ");
						as = xx.nextDouble();
						System.out.print("Tinggi = ");
						ts = xx.nextDouble();
						ls = as*ts/2;
						System.out.println("Luas = "+ls);
					break;

					case 4:
						System.out.println("Lingkaran");
						double ll;
						double rl;
						System.out.print("Radius = ");
						rl = xx.nextDouble();
						ll = Math.PI*rl*rl;
						System.out.print("Luas = "+ll);
					break;

					case 5:
						System.out.println("Jajar Genjang");
						double ljg;
						double ajg;
						double tjg;
						System.out.print("Alas = ");
						ajg = xx.nextDouble();
						System.out.print("Tinggi = ");
						tjg = xx.nextDouble();
						ljg = ajg * tjg;
						System.out.print("Luas = "+ljg);
					break;

					case 6:
						System.out.println("Trapesium");
						double ltr;
						double atr;
						double btr;
						double ttr;
						System.out.print("Sisi Sejajar 1 = ");
						atr = xx.nextDouble();
						System.out.print("Sisi Sejajar 2 = ");
						btr = xx.nextDouble();
						System.out.print("Tinggi = ");
						ttr = xx.nextDouble();
						ltr = 0.5 * ((atr + btr) * ttr);
						System.out.print("Luas = "+ltr);
					break;

					case 7:
						System.out.println("Belah Ketupat");
						double lbk;
						double d1bk;
						System.out.print("Diagonal 1 = ");
						d1bk = xx.nextDouble();
						System.out.print("Diagonal 2 = ");
						d2bk = xx.nextDouble();
						System.out.print("Luas = "+lbk(d1bk, d2bk));
					break;

					case 8:
						System.out.println("Layang-Layang");
						double d1ll;
						double d2ll;
						System.out.print("Diagonal 1 = ");
						d1ll = xx.nextDouble();
						System.out.print("Diagonal 2 = ");
						d2ll = xx.nextDouble();
						System.out.print("Luas = "+lll(d1ll, d2ll));
					break;
					}
					break;
					
					case 2:
						
		}
	}
}