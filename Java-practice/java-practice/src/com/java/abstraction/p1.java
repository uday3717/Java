package com.java.abstraction;
abstract class Employee {
	   private String name;
	   private String address;
	   private int number;
	   public double computePay() {
		     System.out.println("Inside Employee computePay");
		     return 0.0;
		   }
		   
		   public void mailCheck() {
		      System.out.println("Mailing a check to " + this.name + " " + this.address);
		   }
		   
		   
public Employee(String name, String address, int number) {
			super();
			this.name = name;
			this.address = address;
			this.number = number;
		}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", number=" + number + "]";
}
	
}
class Salary extends Employee {
	private double salary;
	   public Salary(String name, String address, int number,double salary) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
		setSalary(salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName() + " with salary " + salary);
	   }
	   
}

public class p1 {
public static void main(String[] args) {
	//Employee e = new Employee("George W.", "Houston, TX", 43);NOT POSSIBLE
    Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	Employee e=new Salary("John Adams", "Boston, MA", 2, 2400.00);
	System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();
}
}
