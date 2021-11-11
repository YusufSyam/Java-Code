package KelasPBO;

public class Box {

	private double height;
	private double width;
	private double depth;
	private String name;
	
	public Box(){
		System.out.println("Ini konstruktor"); //ini konstruktor
	}
	
	public Box(String name){
		System.out.println("Ini konstruktor nama");
	}
	
	void getHeight(double height) {
		this.height= height;
	}
	
	void getWidth(double width) {
		this.width= width;
	}
	
	void getDepth(double depth) {
		this.depth= depth;
	}
	
	void getName(String name ) {
		this.name= name;
	}
	
	double getVolume() {
		return (height*width*depth);
	}
	
	void desc() {
		System.out.println("\n"+name);
		System.out.println("Height\t= "+height+" cm");
		System.out.println("Width\t= "+width+" cm");
		System.out.println("Depth\t= "+depth+" cm");
		System.out.println("Volume\t= "+getVolume()+" cm");
	}
}
