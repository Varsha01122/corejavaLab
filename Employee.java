 package com.examples.bll;
import java.util.Scanner;
public class Employee {
	
	int ID; 
	String name;
	String department;
	float salary;
	
	
	public void GetDetails() {// Creating GetDetails() method
		Scanner sc=new Scanner(System.in);//Scanner object
		
		
		
		System.out.println("Enter :name "); //asking user for employee name
		name=sc.nextLine();//storing the value of name
		
		System.out.println("Enter : ID"); //asking user for employee id
		ID=sc.nextInt();//storing the value of ID
		
		System.out.println("Enter :salary: "); //asking user for employee salary
		salary=sc.nextFloat();//storing the value of salary
		
		System.out.println("Enter :department"); //asking user for employee department
		department=sc.nextLine();//storing the value of department
		
		
		
		
	}
	
	public void PrintDetails() {//Creating PrintDetails() method
		
		System.out.println("ID: "+ID );//printing ID
		System.out.println("Name: "+name );//printing name
		System.out.println("Department: "+department );//printing department
		System.out.println("Salary: "+salary );//printing salary
		
	}
	
	
	
	
	

}