import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Modulb7no1_2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		ArrayList <String> movie= new ArrayList<>();
		movie.add("Road To Ninja : Naruto the Movie");
		movie.add("Love Forecast");
		movie.add("Suckseed");
		movie.add("Gintama Movie 2 : Be Forever Yorozuya");
	HashMap <Integer, String> movieDetails= new HashMap<>();
		movieDetails.put(1,	"Judul\t : "+movie.get(0)+"\n"+
							"Rilis\t : 28 Juli 2012\n"+
							"Durasi\t : 1 jam 50 menit\n"+
							"Genre\t : Fantasy, Adventure, Action, Romance\n"+
							"Sinopsis : Naruto dan sakura dijebak dalam dunia paralel oleh Madara, yang ingin mencuri Kyuubi dari Naruto \n"+
							"Cast\t : Junko Takeuchi, Chie Nakamura, Toshiyuki Morikawa, Emi Shinohara\n");
		movieDetails.put(2,	"Judul\t : "+movie.get(1)+"\n"+
							"Rilis\t : 15 Januari 2015\n"+
							"Durasi\t : 1 jam 58 menit\n"+
							"Genre\t : Romance, Comedy, Friendship\n"+
							"Sinopsis : Jun su, Seorang laki-laki yang mencintai teman masa kecilnya, Hyun woo\n"+
							"Cast\t : Lee Seung-gi, Moon Chae-won, Lee Seo-jin, Jung Joon-young\n");
		movieDetails.put(3,	"Judul\t : "+movie.get(2)+"\n"+
							"Rilis\t : 17 Maret 2011\n"+
							"Durasi\t : 2 jam 10 menit\n"+
							"Genre\t : Music, Comedy, Romance, Friendship, School\n"+
							"Sinopsis : Ped kembali bertemu Ern, perempuan yang dicintainya diam-diam setelah 6 tahun berpisah\n"+
							"Cast\t : Jirayu La-ongmanee, Nattasha Nauljam, Pachara Chirathivat, Thawat Pornrattana prasert\n");
		movieDetails.put(4,	"Judul\t : "+movie.get(3)+"\n"+
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
		
		if(input.charAt(0)=='d') {
			if(movieDetails.containsKey(Integer.parseInt(input.substring(2))) && movieDetails.get(Integer.parseInt(input.substring(2)))!=null) {
				System.out.println(movieDetails.get(Integer.parseInt(input.substring(2))));
			}
		}else if(input.charAt(0)=='s') {
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
			
		}else if(input.charAt(0)=='r') {
			boolean kurang= false;
			for(int i=0; i<movie.size(); i++) {
				if(input.substring(2).equals(Integer.toString(i+1))) {
					movie.remove(i);
				}
			}
				for(int i=0; i<movie.size(); i++) {
					if(movie.get(i)==null) {
						kurang= true;
						movie.add(movie.get(i+1));
					}else {
						if(kurang==false) {
						i++;
						}else if(kurang==true){
						movie.add(movie.get(i+1));
						}
					}
	}
				
	}else if(input.charAt(0)=='a') {
			System.out.print("Judul\t : ");
			movie.add((movie.size()), xx.nextLine());
			
			movieDetails.put((movieDetails.size()+1),	
									"Judul : "+movie.get((movie.size())-1)+"\n");
			System.out.print("Rilis\t : ");
			movieDetails.put((movieDetails.size()),	
									movieDetails.get((movieDetails.size())-1)+"Rilis\t : "+xx.nextLine()+"\n");
			System.out.print("Durasi\t : ");
			movieDetails.put((movieDetails.size()),	
									movieDetails.get((movieDetails.size())-1)+"Durasi\t : "+xx.nextLine()+"\n");
			System.out.print("Genre\t : ");
			movieDetails.put((movieDetails.size()),	
									movieDetails.get((movieDetails.size())-1)+"Genre\t : "+xx.nextLine()+"\n");
			System.out.print("Sinopsis : ");
			movieDetails.put((movieDetails.size()),	
									movieDetails.get((movieDetails.size())-1)+"Sinopsis : "+xx.nextLine()+"\n");
			System.out.print("Cast\t : ");
			movieDetails.put((movieDetails.size()),	
									movieDetails.get((movieDetails.size())-1)+"Cast\t : "+xx.nextLine()+"\n");
		}else if(input.equals("e")){
			System.out.println("End.");
			break;
		}else {
		
			System.out.println("Input salah");
			
		}
		System.out.println("\nLewat\n");
		
	
	}
		}
}
