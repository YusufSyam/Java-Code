import java.util.Scanner;

	class Pokemon{
		public static void main(String [] args){
			Scanner xx= new Scanner(System.in);
			System.out.print("Pokemon 1 : ");
			String p1= xx.next();
			String e1= xx.next();
			System.out.print("vs\nPokemon 2 : ");
			String p2= xx.next();
			String e2= xx.next();
			if(e1.equals("fire")){
				if(e2.equals("ice")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("electric")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("water")){
					System.out.print(p2+" "+e2+" win");
				}else if(e2.equals("ground")){
					System.out.print(p2+" "+e2+" win");
				}else{
					System.out.print("draw");
				}
			}else if(e1.equals("ground")){
				if(e2.equals("fire")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("electric")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("water")){
					System.out.print(p2+" "+e2+" win");
				}else if(e2.equals("ice")){
					System.out.print(p2+" "+e2+" win");
				}else{
					System.out.print("draw");
				}
			}else if(e1.equals("water")){
				if(e2.equals("fire")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("ground")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("ice")){
					System.out.print(p2+" "+e2+" win");
				}else if(e2.equals("electric")){
					System.out.print(p2+" "+e2+" win");
				}else{
					System.out.print("draw");
				}
			}else if(e1.equals("ice")){
				if(e2.equals("ground")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("wind")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("fire")){
					System.out.print(p2+" "+e2+" win");
				}else if(e2.equals("electric")){
					System.out.print(p2+" "+e2+" win");
				}else{
					System.out.print("draw");
				}
			}else if(e1.equals("electric")){
				if(e2.equals("water")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("ice")){
					System.out.print(p1+" "+e1+" win");
				}else if(e2.equals("fire")){
					System.out.print(p2+" "+e2+" win");
				}else if(e2.equals("ground")){
					System.out.print(p2+" "+e2+" win");
				}else{
					System.out.print("draw");
				}
			}
		}
	}