import java.util.Scanner;
	
	class no3 {
		public static void main(String [] args) {
			Scanner x= new Scanner (System.in);
			System.out.print("Ketinggian menara : ");
			double h= x.nextDouble();
			System.out.print("Sudut elevasi pengamat dengan ujung depan kapal : ");
			double a= x.nextDouble();
			System.out.print("Sudut elevasi pengamat dengan ujung belakang kapal : ");
			double b= x.nextDouble();
			double pjg;
				a=Math.toRadians(a);
				b=Math.toRadians(b);
			pjg=((Math.tan(a)*h)-(Math.tan(b)*h));
				System.out.printf("Panjang kapal adalah : %.1f m",pjg);
				
		}

}
