import java.util.Scanner;

public class Soal1KakI{
	public static void main(String [] args){
		Scanner xx= new Scanner(System.in);
			int employees= xx.nextInt();
			int hoursWorked= xx.nextInt();
			double salaryPerHours= xx.nextDouble();
			double salary= hoursWorked*salaryPerHours;
			System.out.println("Number = "+employees);
			System.out.printf("Salary = U$ %.2f",salary);																		
																					
	}
}