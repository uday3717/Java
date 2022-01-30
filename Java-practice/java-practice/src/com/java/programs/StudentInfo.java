package com.java.programs;
class Stud {
	int sno;
	String name;
	String city;
	double cgp;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCgp() {
		return cgp;
	}
	public void setCgp(double cgp) {
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	public Stud(int sno, String name, String city, double cgp) {
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	public Stud() {
		
	}
}
public class StudentInfo {
public static void main(String[] args) {
	Stud obj=new Stud();
	obj.setSno(1);
	obj.setName("Joo");
	obj.setCity("Bangalore");
	obj.setCgp(8.56);
	System.out.println(obj);
	System.out.println("-------------------------");
	System.out.println(obj.getSno());
	System.out.println(obj.getName());
	System.out.println(obj.getCity());
	System.out.println(obj.getCgp());

}
}
