package KelasPBO;

public class OuterClass {
	private Integer id;
	
	public OuterClass(Integer id) {
		this.id= id;
	}
	
	private class InnerClass{
		public Integer getId() {
			return id==null? 0 : id;
		}
	}
	
	public int getInner() {
		InnerClass inner= new InnerClass();
		return inner.getId();
	}
}
