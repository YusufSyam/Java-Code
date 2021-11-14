import java.util.Scanner;
import java.util.ArrayList;

public class Modulb7no1_4 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		ArrayList <String> movie= new ArrayList<>();	
		ArrayList <String> movieDetails= new ArrayList<>();
	
		boolean jalanTros= true;
		
		while(jalanTros==true) {
		
		System.out.println("Favourite Movie");
		
		if(movie.size()==0)System.out.println("1. -");
		if(movie.size()>0)for(int i=0; i<movie.size(); i++)System.out.println((i+1)+". "+movie.get(i));
			
		System.out.print("(d)Detail (s)Search (a)Add (r)Remove (e)End Session\n> ");
		String input= xx.nextLine();
		
		if(input.length()>2 && input.substring(0,2).equals("d ")) {
			if(Integer.parseInt(input.substring(2))>movie.size()) {
				System.out.println("Data tidak ada");
			}else {
				System.out.println(movieDetails.get(Integer.parseInt(input.substring(2))-1));
			}
			
		}else if(input.length()>2 && input.substring(0,2).equals("s ")) {
			boolean ada= false;
			for(int i=0; i<movie.size(); i++) {
			if(movie.get(i).contains(input.substring(3, input.length())) && input.length()>3 || input.length()==3 && movie.get(i).contains(input.substring(2))){
				System.out.println((i+1)+". "+movie.get(i));
				ada= true;
			}
			}
			if(ada==false) {
				System.out.println("Kata '"+input.substring(2,input.length())+"' tidak ada dalam data film");
			}
			
		}else if(input.length()>2 && input.substring(0,2).equals("r ")) {
			if(Integer.parseInt(input.substring(2))>movie.size()) {
				System.out.println("Indeks movie hanya sampai "+movie.size());
			}else{
				for(int i=0; i<movie.size(); i++) {
				if(input.substring(2).equals(Integer.toString(i+1))) {
					movie.remove(i);
					movieDetails.remove(i);
			}
			}
			}
		
		}else if(input.equals("a")) {
				System.out.print("Judul\t : ");
				String judul= xx.nextLine();
				movie.add(judul);
				movieDetails.add(tambahData(movieDetails, judul));
			
		}else if(input.equals("e")){
			System.out.println("End.");
			break;
			
		}else {
			System.out.println("Input salah");
		}
		
		System.out.println("\n");
		}
		}
	
	public static String tambahData(ArrayList <String> a, String judul) {
		Scanner xx= new Scanner(System.in);
		System.out.print("Rilis\t : ");
		String rilis= xx.nextLine();
		
		System.out.print("Durasi\t : ");
		String durasi= xx.nextLine();
		
		System.out.print("Genre\t : ");
		String genre= xx.nextLine();
		
		System.out.print("Sinopsis : ");
		String sinopsis= xx.nextLine();
		
		System.out.print("Cast\t : ");
		String cast= xx.nextLine();
		
		return  "Judul\t : "+judul+
				"\nRilis\t : "+rilis+
				"\nDurasi\t : "+durasi+
				"\nGenre\t : "+genre+
				"\nSinopsis : "+sinopsis+
				"\nCast\t : "+cast;
		}
		}
