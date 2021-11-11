import java.util.Scanner;

	class no1 {
		public static void main(String [] args) {
			Scanner x= new Scanner(System.in);
			System.out.println("Rata-rata waktu (Jam) : ");
			double a= x.nextDouble();			
			System.out.println("Rata-rata Kecepatan (Km/Jam) : ");
			double b= x.nextDouble();			
			double c= (a*b/14);
			System.out.printf("Bensin yang digunakan : %.3f L",c );
		}

}
