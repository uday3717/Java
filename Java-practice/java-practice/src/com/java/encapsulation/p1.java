package com.java.encapsulation;
class employ{
	private int id;
	private String name;
	private double basic;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "employ [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}
	
}
public class p1 {
public static void main(String[] args) {
	employ ob=new employ();
			ob.setId(1);
	ob.setName("uday");
	ob.setBasic(25500);
	System.out.println(ob);
}
}
