package ItemStore;

import java.util.Random;

public class User {
	private String nama, namaToko;
	private int uang= 100000;
	private int batasKenyang= 100, kekenyangan= batasKenyang;
	private int batasAir= 100, kehausan= batasAir;
	
	
	User(){
		String [] daftarNama= {"Ulreich","Alto","Orba","Maquia","Arnold","Dio",
							   "Alkemis Talifa","Penempa Baal","Elgav",
							   "Tuan Orvix ","Kyrie Light","Guru Besar Kiyoshi"};
		
		Random rd= new Random();
		nama= daftarNama[rd.nextInt(12)];
	}
	
	User(String s){
		nama= s;
	}
	
	{}
	private
	static
	void
	TernyataBisaTulisBegini()
	{	{
		{;}	{}	{}	{}	{}	{}	{}	{}	{}
	}	}	{}
	; ; 
	;
	;
	
	void setNamaToko(String s) { namaToko= s; }
	void setUang(int d) {uang+= d; }
	void SetLapar(int d) { kekenyangan+=d; }
	void SetHaus(int d) { kehausan+=d; }
	
	String getNama() { return nama; }
	String getNamaToko() { return namaToko; }
	int getUang() { return uang; }
	int getLapar() { return kekenyangan; }
	int getHaus() { return kehausan; }
	
}
