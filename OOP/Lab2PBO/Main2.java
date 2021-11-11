package Lab2PBO;

class Employee{
	private String name= "Karina";
	double salary= 1;
	
	public void setName(String name) { this.name= name;}
	
	public String getName() { return name;}
}


public class Main2 {
	public static void main(String [] args) {
		Employee emp= new Employee();
		emp.setName("Akbar");
		System.out.println(emp.getName());
	}
}
