import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {
    	Scanner xx= new Scanner(System.in);

        String  lines = xx.nextLine();
        String[] strs = lines.trim().split("\\s+");

        float a = Float.parseFloat(strs[0]);
        float b = Float.parseFloat(strs[1]);
        float c = Float.parseFloat(strs[2]);

        float det = (float) (Math.pow(b,2)-4*a*c);

        if(a == 0 || det < 0){
            System.out.println("Impossivel calcular");
        }
        else {
            float r1 = (float) ((-b + Math.pow(det,0.5))/(2*a));
            float r2 = (float) ((-b - Math.pow(det,0.5))/(2*a));

            System.out.printf("R1 = %.5f\n",r1);
            System.out.printf("R2 = %.5f\n",r2);
        }
    }
}