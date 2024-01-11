package com.kn.pack1;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EmployeeManager m=new EmployeeManager(8);
		boolean b=true;
		while(b) {
			System.out.println("Enter your choice");
			int in=scan.nextInt();
			if(in==1) {
				System.out.println("Enter the name of employee");
				String name=scan.next();
				System.out.println("Enter the salary");
				double salary=scan.nextDouble();
				m.addEmployee(name, salary);
			}
			else {
				b=false;
			}
		}
	}

}
