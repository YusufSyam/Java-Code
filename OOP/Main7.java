class Book{
	String name;
	
	void setName(String a){name= a;}
}

public class Main2{
	public static void main(String [] args){
		Book b= new Book();
		b.setName("PBO");
		System.out.println(b.name);
	}
}