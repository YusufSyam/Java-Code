package BelajarOOP;

public class Mobil {
	
	String pemilikMobil;
	String jenisMobil;
	String warnaMobil;
	double kecepatanMaksMobil;
	
	String kecepatan() {
		if(kecepatanMaksMobil<= 70 ) return "lambat";
		else if(kecepatanMaksMobil<= 150) return "lumayan cepat";
		else return "cepat";
	}
	
	void jalankan() {
		System.out.println(pemilikMobil+", pemilik mobil "+jenisMobil+" "+warnaMobil);
		System.out.println("Mobilnya "+kecepatan());
	}
	
}
