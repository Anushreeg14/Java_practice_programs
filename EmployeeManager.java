package com.kn.pack1;

public class EmployeeManager {
	private Employee[] e;
	private int size;
	private int capacity;
	EmployeeManager(int capacity){
		e=new Employee[capacity];
	}
	public void addEmployee(String name,double salary) {
		if(size<capacity) {
		e[size]=new Employee();
		System.out.println("Successfully added employee details and generated id is :");
		size++;
	}
		else {
			System.out.println("No vacancy in the company");
		}
	}
	public void searchEmployee(int id) {
		for(int i=0;i<size;i++) {
			if(e[i].getId()==id) {
				System.out.println("Employee Details : ");
				System.out.println("Employee Id: "+e[i].getId());
				System.out.println("Employee Name: "+e[i].getName());
				System.out.println("Employee Salary: "+e[i].getSalary());
			}
		}
	}
	public void displayEmployee() {
		for(int i=0;i<size;i++) {
				System.out.println("Employee Id: "+e[i].getId());
				System.out.println("Employee Name: "+e[i].getName());
				System.out.println("Employee Salary: "+e[i].getSalary());
		
	}
		}
	}
	
	


