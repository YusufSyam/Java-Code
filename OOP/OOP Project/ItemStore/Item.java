package ItemStore;

import java.util.Random;

public class Item {
	private String nama, tipe;
	private int harga, kenyang= 0, kehausan= 0, kenaikanHarga= 0, kuantitas= 0;

	Item(){}
	
	Item(String s, int d, String s2){
		nama= s;
		harga= d;
		tipe= s2;
	}
	
	void setNama(String s) { nama= s; }
	void setHarga(int d) { harga= d; }
	void setKenyang(int d) { kenyang= d; }
	void setHaus(int d) { kehausan= d; }
	void setKuantitas(int d) { kuantitas= d; }
	
	String getNama() { return nama; }
	int getHarga() { return harga; }
	int getKuantitas() { return kuantitas; }
	
	int efekKelaparan(int tambahKenyang, int batasKenyang) {
		if(kenyang+tambahKenyang>batasKenyang) return batasKenyang;
		else return kenyang+tambahKenyang;
		
	}
	
	int efekKehausan(int tambahAir, int batasAir) {
		if(kehausan+tambahAir>batasAir) return batasAir;
		else return kehausan+tambahAir;
	}
	
	int gacha() {
		Random rd= new Random();
		if(rd.nextInt(50)==1) return harga*10;
		else return (1+rd.nextInt((harga/10)*(5/2)));
	}
	
	int naikHarga() {
		return kenaikanHarga;
	}
	
	
	
}
