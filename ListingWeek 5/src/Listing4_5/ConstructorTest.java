package Listing4_5;

import java.util.*;

public class ConstructorTest {
	public static void main (String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
	}
}

class Employee {
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	static{
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}
	
	// object initialization block
	{
		id = nextId;
		nextId++;
	}
	
	// three overloaded constructors
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public Employee(double s){
		this("Employee #" + nextId, s);
	}
	
	public Employee(){
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getId(){
		return id;
	}
}