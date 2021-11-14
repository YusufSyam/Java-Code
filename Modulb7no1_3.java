import java.util.Scanner;
import java.util.ArrayList;

public class Modulb7no1_3 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		ArrayList <String> movie= new ArrayList<>();
			movie.add("Road To Ninja : Naruto the Movie");
			movie.add("Love Forecast");
			movie.add("Suckseed");
			movie.add("Gintama Movie 2 : Be Forever Yorozuya");
			
		ArrayList <String> movieDetails= new ArrayList<>();
			movieDetails.add(	"Judul\t : "+movie.get(0)+"\n"+
								"Rilis\t : 28 Juli 2012\n"+
								"Durasi\t : 1 jam 50 menit\n"+
								"Genre\t : Fantasy, Adventure, Action, Romance\n"+
								"Sinopsis : Naruto dan sakura dijebak dalam dunia paralel oleh Madara, yang ingin mencuri Kyuubi dari Naruto \n"+
								"Cast\t : Junko Takeuchi, Chie Nakamura, Toshiyuki Morikawa, Emi Shinohara\n");
			movieDetails.add(	"Judul\t : "+movie.get(1)+"\n"+
								"Rilis\t : 15 Januari 2015\n"+
								"Durasi\t : 1 jam 58 menit\n"+
								"Genre\t : Romance, Comedy, Friendship\n"+
								"Sinopsis : Jun su, Seorang laki-laki yang mencintai teman masa kecilnya, Hyun woo\n"+
								"Cast\t : Lee Seung-gi, Moon Chae-won, Lee Seo-jin, Jung Joon-young\n");
			movieDetails.add(	"Judul\t : "+movie.get(2)+"\n"+
								"Rilis\t : 17 Maret 2011\n"+
								"Durasi\t : 2 jam 10 menit\n"+
								"Genre\t : Music, Comedy, Romance, Friendship, School\n"+
								"Sinopsis : Ped kembali bertemu Ern, perempuan yang dicintainya diam-diam setelah 6 tahun berpisah\n"+
								"Cast\t : Jirayu La-ongmanee, Nattasha Nauljam, Pachara Chirathivat, Thawat Pornrattana prasert\n");
			movieDetails.add(	"Judul\t : "+movie.get(3)+"\n"+
								"Rilis\t : 6 Juli 2013\n"+
								"Durasi\t : 1 jam 50 menit\n"+
								"Genre\t : Fantasy, Comedy, Action, Time-travel\n"+
								"Sinopsis : Gintoki tiba-tiba terlempar 5 tahun ke masa depan\n"+
								"Cast\t : Tomokazu Sugita, Daisuke Sakaguchi, Rie Kugumiya\n");
			
		boolean jalanTros= true;
		
		while(jalanTros==true) {
		
		System.out.println("Favourite Movie");
			for(int i=0; i<movie.size(); i++) {
				System.out.println((i+1)+". "+movie.get(i));
		}
			
		System.out.println("(d)Detail (s)Search (a)Add (r)Remove (e)End Session");
		System.out.print("> ");
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
