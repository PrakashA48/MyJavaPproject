package com.tech.java8;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String dateofJoining;
	private double salary;
	public Employee(int id, String name, int age, String dateofJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateofJoining = dateofJoining;
		this.salary = salary;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
