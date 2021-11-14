package ecl;
import java.util.Scanner;

class Belajarmethod{
		public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
		double a= xx.nextDouble();
		double b= xx.nextDouble();
		double c= xx.nextDouble();
		LPersegi(a,b);
		LSegitiga(a,b);
		LTrapesium(a, b);
		System.out.println("Luas persegi = "+LPersegi(a, b));
		System.out.println("Luas segitiga = "+LSegitiga(a, b));
		System.out.println("Luas trapesium = "+LTrapesium(a, b));
		}
		
		static double LPersegi(double x, double y){
			return x*y;
		}
		static double LSegitiga(double x, double y){
			return (double)(x*y)/2;
		}
		static double LTrapesium(double x, double y){
			return (double)(x+x)*y/2;
			
		}
	}