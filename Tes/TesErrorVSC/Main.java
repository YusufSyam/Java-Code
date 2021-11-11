class Main{
	public static void main(String [] args){
		A a= new A();
		
		B b= new B();
		B.C c= b.new C();
	}
}