package BelajarOOP;
import java.util.Scanner;

public class Dronemu {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		Drone Dronemu= new Drone();
		
		Dronemu.energi= 20;
		Dronemu.ketinggian= 0;
		
		String atas= "\n\n\n\n\n\n\n\n\n\n\n";
		String turun= "";
		String maju= "\t";

		int kemajuan= 1;
		
		System.out.print("Pilih opsi :\n1. Terbang\n2. Maju\n3. Belok\n4. Mundur\n");
		System.out.print("5. Turun\n6. Matikan Mesin\n");
		System.out.println(atas+maju+"|=[=--"+turun);
		
		for(int i= Dronemu.energi; i>0;){
			System.out.print(">> ");
			int x= xx.nextInt();
			
			switch (x){
				case 1:
					Dronemu.terbang();
					if(Dronemu.energi >10) {
						atas= "";
						for(int j= 10; j>Dronemu.ketinggian; j--) {
							atas+= "\n";
						}
						maju+= "\t";
						kemajuan++;
						turun+= "\n";
					}
					break;
				case 2:
					Dronemu.maju();
					maju+= "\t";
					kemajuan++;
					break;
				case 3:
					Dronemu.belok();
					break;
				case 4:
					Dronemu.mundur();
					maju= "";
					for(int j=0; j<kemajuan-1; j++) {
						maju+= "\t";
					}
					kemajuan--;
					break;
				case 5:
					Dronemu.turun();
					atas+= "\n";
					maju+= "\t";
					kemajuan++;
					turun= "";
					for(int j=0; j<Dronemu.ketinggian; j++) {
						turun+= "\n";
					}
					break;
				case 6:
					Dronemu.matikanMesin();
					break;
				default:
					System.out.println("Input salah");
					break;
			}
			System.out.println(atas+maju+"|=[=--"+turun);
			System.out.println("Ketinggian "+Dronemu.ketinggian+", Energi "+Dronemu.energi);
			i= Dronemu.energi;
		}		
		}
		}
