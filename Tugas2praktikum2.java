import java.util.Scanner;
	
	class Tugas2praktikum2 {
		public static void main(String [] args) {
			Scanner xx= new Scanner(System.in);
			int error= 0;
			String a= xx.nextLine();
			String b= xx.nextLine();
			String c= xx.nextLine();
			if (a.equalsIgnoreCase("vertebrado")) {
				if(b.equalsIgnoreCase("ave")) {
					if(c.equalsIgnoreCase("carnivoro")) {
						System.out.print("agula");
					}else if(c.equalsIgnoreCase("onivoro")) {
						System.out.print("pomba");
					}else{
						error++;
					}
				}else if(b.equalsIgnoreCase("mamifera")) {
					if(c.equalsIgnoreCase("onivoro")) {
						System.out.print("homem");
					}else if(c.equalsIgnoreCase("herbivora")) {
						System.out.print("vaca");
					}else{
						error++;
					}
				}else{
						error++;
				}
			}else if(a.equalsIgnoreCase("invertebrado")) {
				if(b.equalsIgnoreCase("inseto")) {
					if(c.equalsIgnoreCase("hematofago")) {
						System.out.print("pulga");
					}else if(c.equalsIgnoreCase("herbivoro")) {
						System.out.print("lagarta");
					}else{
						error++;
					}
				}else if(b.equalsIgnoreCase("anelideo")) {
					if(c.equalsIgnoreCase("hematofago")) {
						System.out.print("sanguessuga");
					}else if(c.equalsIgnoreCase("onivoro")) {
						System.out.print("minhoca");
					}else{
						error++;
					}
				}else{
						error++;
				}
			}else{
						error++;
			}
			if(error>0){
					System.out.print("Inputan salah");
			}
		}
	}
