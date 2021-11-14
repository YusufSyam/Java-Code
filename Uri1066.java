import java.util.Scanner;

public class Uri1066 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		int [] value= new int[5];
		int even= 0;
		int odd= 0;
		int pos= 0;
		int neg= 0;
		for(int i=0; i<5; i++) {
			value[i]= xx.nextInt();
			if(value[i]%2==0) {
				even++;
			}else if(value[i]%2!=0) {
				odd++;
			}
			if(value[i]>0) {
				pos++;
			}else if(value[i]<0) {
				neg++;
			}
		}
		System.out.println(even+" valor(es) par(es)");
		System.out.println(odd+" valor(es) impar(es)");
		System.out.println(pos+" valor(es) positivo(s)");
		System.out.println(neg+" valor(es) negativo(s)");
	}
}
