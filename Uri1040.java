import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args){
    	Scanner iswanto= new Scanner(System.in);
    	
        String  lines= iswanto.nextLine();
        String[] strs= lines.trim().split("\\s+");

        float n1= Float.parseFloat(strs[0]);
        float n2= Float.parseFloat(strs[1]);
        float n3= Float.parseFloat(strs[2]);
        float n4= Float.parseFloat(strs[3]);

        float med= (2*n1 + 3*n2 + 4*n3 + n4)/10;
        System.out.printf("Media: %.1f\n",med);

        if(med>= 7){
            System.out.println("Aluno aprovado.");
        }else if(med< 5){
            System.out.println("Aluno reprovado.");
        }else if (med>= 5 && med< 7){
            System.out.println("Aluno em exame.");
            float n= iswanto.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",n);
            med = (med + n)/2;
            if(med>= 5){
                System.out.println("Aluno aprovado.");
            }
            else if (med<= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", med);
        }
    }
}