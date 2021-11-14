import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

public class Modulb7no1 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		HashMap <Integer, String> details= new HashMap<>();
		boolean jalanTerus= true;
		
		while(jalanTerus==true) {
		HashMap <Integer , String> movie= new HashMap<>();
			movie.put(1, "Road To Ninja : Naruto the Movie");
			movie.put(2, "Love Forecast");
			movie.put(3, "Suckseed");
			movie.put(4, "Gintama Movie 2 : Be Forever Yorozuya");
			
		System.out.println("Favourite Movie");
		for(int i=1; i<=movie.size(); i++) {
			System.out.println(i+". "+movie.get(i));
		}
		
		System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
		System.out.print("> ");
		String d= xx.nextLine();
		
		if(d.charAt(0)=='d') {
				details.put(1,		"Judul\t : Road To Ninja : Naruto the Movie\n"+
									"Rilis\t : 28 Juli 2012\n"+
									"Durasi\t : 1 jam 50 menit\n"+
									"Genre\t : Fantasy, Adventure, Action, Romance\n"+
									"Sinopsis : Naruto dan sakura dijebak dalam dunia paralel oleh Madara, yang ingin mencuri Kyuubi dari Naruto \n"+
									"Cast\t : Junko Takeuchi, Chie Nakamura, Toshiyuki Morikawa, Emi Shinohara\n");
				details.put(2,	"Judul\t : Love Forecast\n"+
									"Rilis\t : 15 Januari 2015\n"+
									"Durasi\t : 1 jam 58 menit\n"+
									"Genre\t : Romance, Comedy, Friendship\n"+
									"Sinopsis : Jun su, Seorang laki-laki yang mencintai teman masa kecilnya, Hyun woo\n"+
									"Cast\t : Lee Seung-gi, Moon Chae-won, Lee Seo-jin, Jung Joon-young\n");
				details.put(3,	"Judul\t : Suckseed\n"+
									"Rilis\t : 17 Maret 2011\n"+
									"Durasi\t : 2 jam 10 menit\n"+
									"Genre\t : Music, Comedy, Romance, Friendship, School\n"+
									"Sinopsis : Ped kembali bertemu Ern, perempuan yang dicintainya diam-diam setelah 6 tahun berpisah\n"+
									"Cast\t : Jirayu La-ongmanee, Nattasha Nauljam, Pachara Chirathivat, Thawat Pornrattana prasert\n");
				details.put(4,	"Judul\t : Gintama Movie 2 : Be Forever Yorozuya\n"+
									"Rilis\t : 6 Juli 2013\n"+
									"Durasi\t : 1 jam 50 menit\n"+
									"Genre\t : Fantasy, Comedy, Action, Time-travel\n"+
									"Sinopsis : Gintoki tiba-tiba terlempar 5 tahun ke masa depan\n"+
									"Cast\t : Tomokazu Sugita, Daisuke Sakaguchi, Rie Kugumiya\n");
				
			if(details.containsKey(d.substring(2))) {
				System.out.println(details.get(d.substring(2)));
		}
			
		}else if(d.charAt(0)=='r') {
			boolean kurang= false;
				if(d.equalsIgnoreCase("r 1")) {
					movie.remove(1);
				}else if(d.equalsIgnoreCase("r 2")) {
					movie.remove(2);
				}else if(d.equalsIgnoreCase("r 3")) {
					movie.remove(3);
				}else if(d.equalsIgnoreCase("r 4")) {
					movie.remove(4);
				}
					for(int i=1; i<=movie.size(); i++) {
						if(movie.get(i)==null) {
							kurang= true;
							System.out.println(i+". "+movie.get(i+1));
						}else {
							if(kurang==false) {
							System.out.println(i+". "+movie.get(i));
							}else if(kurang==true){
							System.out.println(i+". "+movie.get(i+1));
							}
						}
		}
					
		}else if(d.charAt(0)=='s') {
			boolean ada= false;
			for(int i=1; i<=movie.size(); i++) {
			if(movie.get(i).contains(d.substring(3, d.length())) && d.length()>3 || d.length()==3 && movie.get(i).contains(d.substring(2))){
				System.out.println(i+". "+movie.get(i));
				ada= true;
			}
			}
			if(ada==false) {
				System.out.println("Kata '"+d.substring(2,d.length())+"' tidak ada dalam data film");
			}
			
		}else if(d.charAt(0)=='a') {
			details.put(Integer.toString(details.size()+1),	
					"Judul\t : "+xx.next()+"\n"+
					"Rilis\t :"+xx.next()+"\n"+
					"Durasi\t : "+xx.next()+"\n"+
					"Genre\t : "+xx.next()+"\n"+
					"Sinopsis : "+xx.next()+"\n"+
					"Cast\t : "+xx.next()+"\n");
													
		}else {
			System.out.print("Input Salah");
		}
		}
		
	}
}
