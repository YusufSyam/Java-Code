class Person{
	static int x= 10;
}

public class Main4 extends Person{
	public static void main(String [] args){
		Person p= new Person();
		Person p2= new Person();
		p.x= 20;
		p2.x= 30;
		System.out.println(p.x);
		System.out.println(p2.x);
		System.out.println(Person.x);
		
	}

}