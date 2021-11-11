package KelasPBO;

public class Person {
	String name;
	int age;
	boolean isMale;
	
	Person(){
		name= "unknown";
		age= 0;
		isMale= true;
	}
	
	Person(String name){
		this.name= name;
	}
	
	Person(String name, int age){
		this.name= name;
		this.age= age;
	}
	
}
