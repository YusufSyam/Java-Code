package Library;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Main {
	static Scanner xx= new Scanner(System.in);
	static ArrayList <Book> daftarBuku= new ArrayList<>();
	static ArrayList <String> daftarPengunjung= new ArrayList<>();
	static ArrayList <String> daftarTanggal= new ArrayList<>();
	static User pengunjung;
	static String log= "";
	
	public static void main(String [] args) {
		setBuku();
		tambahTanggal();
		luarPerpustakaan();
	}
	
	static void luarPerpustakaan() {
		System.out.println(" _________________________________________________");
		System.out.println("|_|_|_|_|_|_|_|     PERPUSTAKAAN    |_|_|_|_|_|_|_|");
		System.out.println("||/            ---------------------            \\||");
		System.out.println("|| 1. Masuk perpustakaan sebagai tamu            ||");
		System.out.println("|| 2. Masuk perpustakaan sebagai anggota/member  ||");
		System.out.println("|| 3. Pergi                                      ||");
		System.out.println("||                                               ||");
		System.out.print(">  ");
		
		String input= xx.next();
		System.out.println();
		
		if(input.equals("1")) tamuMasuk();
		else {
			System.out.println("> Input salah");
			luarPerpustakaan();
		}
	}
	
	static void tamuMasuk() {
		System.out.print("> Silahkan masukkan nama : ");
		String inputName= xx.next();
		pengunjung= new Guest(inputName, setWaktu());
		
		daftarPengunjung.add(inputName);
		//perbaiki nextLine scanner nya
		
		log= log+"-"+setWaktu()+" -> Pertama kalinya memasuki perpustakaan\n";
		pengunjung.daftarLog.put(setTanggal(), log);
		
		opsiUntukTamu();
	}
	
	static void opsiUntukTamu() {
		while(true) {
			System.out.println("\n(Dalam perpustakaan)");
			System.out.println(" 1. Lihat daftar buku");
			System.out.println(" 2. Periksa detail buku");
			System.out.println(" 3. Baca buku");
			System.out.println(" 4. Lihat riwayat aktivitas");
			System.out.println(" 5. Lihat daftar pengunjung yang masuk perpustakaan hari ini");
			System.out.println(" 6. Mendaftar menjadi anggota perpustakaan");
			System.out.println(" 7. Keluar");
			System.out.print("> ");
			
			String input= xx.next();
			System.out.println();
			
			try {
				if(input.equals("1")) lihatDaftarBuku();
				else if(input.equals("2")) tamuPeriksaBuku(input);
				else if(input.equals("3")) tamuPeriksaBuku(input);
				else if(input.equals("4")) pengunjung.lihatRiwayatAktivitas();
				else if(input.equals("5")) lihatDaftarPengunjung();
				else if(input.equals("6")) {
					mendaftarJadiAnggota();
					break;
				}else if(input.equals("7")) {
					System.out.println("> Keluar dari perpustakaan..");
					pengunjung= null;
					log= "";
					luarPerpustakaan();
					break;
				}
				else System.out.println("> Input salah");
			}catch(Exception e) {System.out.println("> Input salah");}
		}
	}
	
	static void opsiUntukAnggota() {
		while(true) {
			System.out.println("\n(Dalam perpustakaan)");
			System.out.println(" 1. Lihat daftar buku");
			System.out.println(" 2. Periksa detail buku");
			System.out.println(" 3. Baca buku");
			System.out.println(" 4. Meminjam buku");
			System.out.println(" 5. Kembalikan buku");
			System.out.println(" 6. Lihat riwayat aktivitas");
			System.out.println(" 7. Lihat daftar pengunjung yang masuk perpustakaan hari ini");
			System.out.println(" 8. Keluar");
			System.out.print("> ");
			
			String input= xx.next();
			System.out.println();
			
			try {
				if(input.equals("1")) lihatDaftarBuku();
				else if(input.equals("2")) anggotaPeriksaBuku(input);
				else if(input.equals("3")) anggotaPeriksaBuku(input);
				else if(input.equals("4")) anggotaPinjamBuku();
				else if(input.equals("5")) anggotaKembalikanBuku();
				else if(input.equals("6")) {
					if(!tambahTanggal()) {
						log= "";
						pengunjung.daftarLog.put(setTanggal(),"");
					}
					pengunjung.lihatRiwayatAktivitas();
				}
				else if(input.equals("7")) lihatDaftarPengunjung();
				else if(input.equals("8")) {
					System.out.println("> Keluar dari perpustakaan..");
					pengunjung= null;
					log= "";
					luarPerpustakaan();
					break;
				}
				else System.out.println("> Input salah");
			}catch(Exception e) {System.out.println("> Input salah");}
		}
	}
	
	static void mendaftarJadiAnggota(){
		System.out.println("> Saat menjadi anggota, anda bisa meminjam buku di perpustakaan(biaya pendaftaran Rp. 30000)");
		System.out.print("> Apakah anda ingin menjadi anggota perpustakaan? (y/n) : ");
		
		if(xx.next().equalsIgnoreCase("y")) {
			int uangPendaftaran= 30000;
			
			if(pengunjung.membayar(uangPendaftaran)) {
				pengunjung= pengunjung.menjadiMember();
				log= log+"-"+setWaktu()+" -> Mendaftar menjadi anggota perpustakaan\n";
				pengunjung.daftarLog.put(setTanggal(), log);
			}
			
			System.out.println("> Selamat anda berhasil menjadi anggota!");
			System.out.println("> (INGAT) kata sandi perpustakaan = library124");
			opsiUntukAnggota();
		}else {
			System.out.println("> Anda menolak menjadi anggota..");
			opsiUntukTamu();
		}
	}
	
	static void lihatDaftarBuku() throws Exception{
		System.out.println(setTanggal()+"TaNGGAL");
		
		System.out.println(" _________                 _________");
		System.out.println("|_|_|_|_|_|  DAFTAR BUKU  |_|_|_|_|_|");
		
		if(daftarBuku.size()==0) System.out.println("  -Kosong-");
		else {
			for(int i=0; i<daftarBuku.size(); i++) {
				System.out.printf(" %d. Buku %s\n",(i+1),daftarBuku.get(i).getJudul());
			}
		}
	}
	
	static void tamuPeriksaBuku(String detailAtauBaca) throws Exception{
		lihatDaftarBuku();
		
		if(daftarBuku.size()==0) return;
		
		System.out.print("> Pilih buku untuk dibaca : ");
		
		String input= xx.next();
		System.out.println();
		int a= keInt(input)-1;
		
		if(a<=daftarBuku.size() && a>=0 && detailAtauBaca.equals("2")) {
			daftarBuku.get(a).detail();
		}else if(a<=daftarBuku.size() && a>=0 && detailAtauBaca.equals("3")) {
			daftarBuku.get(a).bacaBuku();
			log= log+"-"+setWaktu()+" -> Membaca "+daftarBuku.get(a).getJudul()+"\n";
			pengunjung.daftarLog.put(setTanggal(), log);
		}else {
			System.out.println("> Input salah");
		}
	}
	
	static void anggotaPeriksaBuku(String detailAtauBaca) throws Exception{
		lihatDaftarBuku();
		
		if(daftarBuku.size()==0) return;
		
		System.out.print("> Pilih buku untuk dibaca : ");
		
		String input= xx.next();
		System.out.println();
		int a= keInt(input)-1;
		
		if(a<=daftarBuku.size() && a>=0 && detailAtauBaca.equals("2")) {
			daftarBuku.get(a).detail();
		}else if(a<=daftarBuku.size() && a>=0 && detailAtauBaca.equals("3")) {
			daftarBuku.get(a).bacaBuku();
			if(!tambahTanggal()) {
				log= "";
				log= log+"-"+setWaktu()+" -> Membaca "+daftarBuku.get(a).getJudul()+"\n";
				pengunjung.daftarLog.put(daftarTanggal.get(daftarTanggal.size()-1), log);
			}else if(tambahTanggal()) {
				log= log+"-"+setWaktu()+" -> Membaca "+daftarBuku.get(a).getJudul()+"\n";
				pengunjung.daftarLog.replace(setTanggal(), log);
			}
			
		}else {
			System.out.println("> Input salah");
		}
	}
	
	static void anggotaPinjamBuku() throws Exception{
		lihatDaftarBuku();
		
		if(daftarBuku.size()==0) return;
		
		System.out.print("> Pilih buku untuk dipinjam : ");
		
		String input= xx.next();
		System.out.println();
		int a= keInt(input)-1;
		
		if(pengunjung.bukuDipinjam.size()==0 && a<=daftarBuku.size()) {
			
			System.out.print("> Apakah anda ingin meminjam buku "+daftarBuku.get(a).getJudul()+" ? (y/n) :  ");
			if(xx.next().equalsIgnoreCase("y")) {
				System.out.println("> : Anda meminjam buku "+daftarBuku.get(a).getJudul()+" !");
				System.out.println("> : Anda harus mengembalikan buku paling lambat 3 hari ("+setTenggatWaktu()+")");
				pengunjung.bukuDipinjam.add(daftarBuku.get(a));
				pengunjung.bukuDipinjam.get(0).setWaktuPengembalian(setTenggatWaktu());
			}else {
				System.out.println("> : Anda tidak jadi meminjam..");
			}
		}else if(pengunjung.bukuDipinjam.size()>0 && a<=daftarBuku.size()) {
			for(int i=0; i<pengunjung.bukuDipinjam.size(); i++) {
				if(daftarBuku.get(a).getJudul().equals(pengunjung.bukuDipinjam.get(i).getJudul())) {
					System.out.println("> : Anda telah meminjam buku ini, harap kembalikan tepat waktu..");
					return;
				}
			}
			System.out.println("> : Anda telah meminjam "+pengunjung.bukuDipinjam.size()+" buku sebelumnya,");
			System.out.print("> : Apakah anda ingin meminjam lagi buku "+daftarBuku.get(a).getJudul()+" ? (y/n) : ");
			
			if(xx.next().equalsIgnoreCase("y")) {
				System.out.println("> : Anda meminjam buku "+daftarBuku.get(a).getJudul()+" !");
				System.out.println("> : Anda harus mengembalikan buku paling lambat 3 hari ("+setTenggatWaktu()+")");
				pengunjung.bukuDipinjam.add(daftarBuku.get(a));
				pengunjung.bukuDipinjam.get(pengunjung.bukuDipinjam.size()-1).setWaktuPengembalian(setTenggatWaktu());
			}else {
				System.out.println("> : Anda tidak jadi meminjam..");
			}
			
		}else System.out.println("> Input salah");
		
		if(!tambahTanggal()) {
			log= "";
			log= log+"-"+setWaktu()+" -> Meminjam buku "+daftarBuku.get(a).getJudul()+"\n";
			pengunjung.daftarLog.put(daftarTanggal.get(daftarTanggal.size()-1), log);
		}else if(tambahTanggal()) {
			log= log+"-"+setWaktu()+" -> Meminjam buku "+daftarBuku.get(a).getJudul()+"\n";
			pengunjung.daftarLog.replace(setTanggal(), log);
		}
		
	}
	
	static void anggotaKembalikanBuku() {
		if(pengunjung.bukuDipinjam.size()==0) {
			System.out.println(" -Anda belum meminjam buku-");
			return;
		}
		
		if(pengunjung.bukuDipinjam.size()==1) {
			System.out.print("> : Apakah anda ingin mengembalikan buku "+pengunjung.bukuDipinjam.get(0).getJudul()+" ? (y/n) : ");
			if(xx.next().equalsIgnoreCase("y")) {
				
				if(keInt(setTanggal().substring(0,4))<=keInt(pengunjung.bukuDipinjam.get(0).getWaktuPengembalian().substring(0,4)) && keInt(setTanggal().substring(5,7))<=keInt(pengunjung.bukuDipinjam.get(0).getWaktuPengembalian().substring(5,7)) && keInt(setTanggal().substring(8))<keInt(pengunjung.bukuDipinjam.get(0).getWaktuPengembalian().substring(8))) {
					mengembalikanBukuTepatWaktu(0);
				}else if(keInt(setTanggal().substring(0,4))<=keInt(pengunjung.bukuDipinjam.get(0).getWaktuPengembalian().substring(0,4)) && keInt(setTanggal().substring(5,7))<keInt(pengunjung.bukuDipinjam.get(0).getWaktuPengembalian().substring(5,7))) mengembalikanBukuTepatWaktu(0);
				else if(keInt(setTanggal().substring(0,4))<keInt(pengunjung.bukuDipinjam.get(0).getWaktuPengembalian().substring(0,4))) mengembalikanBukuTepatWaktu(0);
				
				else mengembalikanBukuLambat(0);
			}else {
				System.out.println("> : Anda tidak jadi mengembalikan buku..");
			}
		}else {
			System.out.println("(Daftar buku yang dipinjam)");
			
			for(int i=0; i<pengunjung.bukuDipinjam.size(); i++) {
				System.out.println((i+1)+". "+pengunjung.bukuDipinjam.get(i).getJudul());
			}
			
			System.out.print("> Pilih buku untuk dikembalikan : ");
			String input= xx.next();
			int a= keInt(input)-1;
			
			if(a<=pengunjung.bukuDipinjam.size()) {
				System.out.print("> Apakah anda ingin mengembalikan buku "+pengunjung.bukuDipinjam.get(a).getJudul()+" ? (y/n) : ");
				if(xx.next().equalsIgnoreCase("y")) {
					
					if(keInt(setTanggal().substring(0,4))<=keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(0,4)) && keInt(setTanggal().substring(5,7))<=keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(5,7)) && keInt(setTanggal().substring(8))<keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(8))) {
						mengembalikanBukuTepatWaktu(a);
					}else if(keInt(setTanggal().substring(0,4))<=keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(0,4)) && keInt(setTanggal().substring(5,7))<keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(5,7))) mengembalikanBukuTepatWaktu(a);
					else if(keInt(setTanggal().substring(0,4))<keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(0,4))) mengembalikanBukuTepatWaktu(a);
					else mengembalikanBukuLambat(a);
				}else {
					System.out.println("> : Anda tidak jadi mengembalikan buku..");
				}
			}else {
				System.out.println("> Input salah");
			}
				
		}
	}
	
	static void mengembalikanBukuTepatWaktu(int a) {
		System.out.println("> : Anda mengembalikan buku tepat waktu !");
		System.out.println("> : Terima kasih telah menggunakan fasilitas perpustakaan dengan baik ^^");
		if(!tambahTanggal()) {
			System.out.println("!Tambah");
			log= "";
			log= log+"-"+setWaktu()+" -> Mengembalikan buku "+pengunjung.bukuDipinjam.get(a).getJudul()+"\n";
			pengunjung.daftarLog.put(daftarTanggal.get(daftarTanggal.size()-1), log);
		}else if(tambahTanggal()) {
			log= log+"-"+setWaktu()+" -> Mengembalikan buku "+pengunjung.bukuDipinjam.get(a).getJudul()+"\n";
			pengunjung.daftarLog.replace(setTanggal(), log);
		}
		
		pengunjung.bukuDipinjam.remove(a);
	}
	
	static void mengembalikanBukuLambat(int a) {
		int denda= (keInt(setTanggal().substring(0,4))*365+keInt(setTanggal().substring(5,7))*30+keInt(setTanggal().substring(8)))-(keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(0,4))*365+keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(5,7))*30+keInt(pengunjung.bukuDipinjam.get(a).getWaktuPengembalian().substring(8)));
		denda*= 500;
		
		System.out.println("> : Anda telat mengembalikan !!!");
		System.out.println("> : Anda dikenakan denda RP. "+denda+",00 !");
		
		if(!tambahTanggal()) {
			System.out.println("!Tambah");
			log= "";
			log= log+"-"+setWaktu()+" -> Mengembalikan buku "+pengunjung.bukuDipinjam.get(a).getJudul()+"\n";
			pengunjung.daftarLog.put(daftarTanggal.get(daftarTanggal.size()-1), log);
		}else if(tambahTanggal()) {
			log= log+"-"+setWaktu()+" -> Mengembalikan buku "+pengunjung.bukuDipinjam.get(a).getJudul()+"\n";
			pengunjung.daftarLog.replace(setTanggal(), log);
		}
		
		if(pengunjung.membayar(denda)) {
			pengunjung.bukuDipinjam.remove(a);
		}else {
			System.out.println("> : Apa? uang anda tidak cukup untuk membayar denda?!?!");
			System.out.println("> : Silahkan keluar dari perpustakaan ini dan jangan pernah kembali !1!1!1!");
			System.out.println("> Anda ditendang keluar dari perpustakaan..");
			
			luarPerpustakaan();
			return;
			
		}
	}
	
	static void lihatDaftarPengunjung() {
		System.out.println("(Daftar pengunjung hari ini - "+setTanggal()+" - )");
		
		if(!tambahTanggal()) {
			daftarPengunjung= null;
			daftarPengunjung= new ArrayList<>();
			daftarPengunjung.add(pengunjung.getNama());
		}
		for(int i=0; i<daftarPengunjung.size(); i++) System.out.println((i+1)+". "+daftarPengunjung.get(i));
		
	}
	
	static String setTanggal() {
		Date date= new Date();
		return new SimpleDateFormat("yyyy/MM/dd").format(date);
	}
	
	static String setWaktu() {
		Date date= new Date();
		return new SimpleDateFormat("HH:mm").format(date);
	}
	
	static String setTenggatWaktu() {
		Date date= new Date();
		DateFormat formatTahun= new SimpleDateFormat("yyyy");
		DateFormat formatBulan= new SimpleDateFormat("MM");
		DateFormat formatHari= new SimpleDateFormat("dd");
		
		int tahun= keInt(formatTahun.format(date));
		int bulan= keInt(formatBulan.format(date));
		int hari= keInt(formatHari.format(date));
		
		
		Calendar kalender= Calendar.getInstance();
		int maksHari= kalender.getActualMaximum(Calendar.DATE);
		
		if(hari+3>maksHari) {
			hari= hari+3-maksHari;
			bulan++;
		}
		
		if(bulan>12) {
			bulan= 1;
			tahun++;
		}
		
		
		return tahun+"/"+(bulan<10? "0"+bulan : bulan)+"/"+ (hari<10? "0"+hari : hari);
	}
	
	static boolean tambahTanggal() {
		boolean waktuSama= true;
		
		if(daftarTanggal.size()==0) {
			waktuSama= false;
		}else {
			
			for(int i=0; i<daftarTanggal.size(); i++) {
				if(!setTanggal().equals(daftarTanggal.get(i))) {
					waktuSama= false;
				}else if(setTanggal().equals(daftarTanggal.get(i))) {
					waktuSama= true;
					break;
				}
			}
		}
		if(!waktuSama) {
			daftarTanggal.add(setTanggal());
		}
		return waktuSama;
	}
	
	static int keInt(String a) {return Integer.parseInt(a);}
	
	static void setBuku() {
		Book buku1= new Book("Harry Potter","Novel ringan","penulis 1","Airlangga",340);
		Book buku2= new Book("Percy Jackson","Novel ringan","penulis 2","Airlangga",280);
		Book buku3= new Book("Narnia","Novel ringan","penulis 3","Penerbit novel",275);
		Book buku4= new Book("Cara menghasilkan 1000$ tanpa keluar rumah","Buku pelajaran","penulis 4","Airlangga",1000);
	
		buku1.setIsi("Harry Potter..");
		buku2.setIsi("Percy Jackson..");
		buku3.setIsi("Narnia..");
		buku4.setIsi("Binomo..");
		
		daftarBuku.add(buku1);
		daftarBuku.add(buku2);
		daftarBuku.add(buku3);
		daftarBuku.add(buku4);
	}
}
