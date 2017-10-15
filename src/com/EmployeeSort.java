package com;

import java.util.Scanner;
import java.util.TreeSet;

//	Main Class implemented to demonstrate the use of Comparator on the User defined objects
public class EmployeeSort {  

	//	Main method which takes the user input based on the choice which will be provided and invoking the EmployeeComparator Comparator to sort
	public static void main(String[] args) {
		Employee emp = new Employee();										//	User Defined Class object 
		
		Scanner userInput = new Scanner(System.in);							//	Scanner object to take the user input from the console
		TreeSet<Employee> empTree = new TreeSet<Employee>(new EmployeeComparator());
		
		int choice = 0;														//	Declaring the choice element to store the user entered choice

		while (true) {														//	Infinite Loop to get the user input until it is user interpreted.
			System.out.print("Enter 1. Add Employee 2. Display Employee List 3. Exit : ");	//	Displaying options

			choice = userInput.nextInt();									//	Getting the choice from the user

			if (choice == 1) {												//	If Choice is 1 then user can enter values to Employee Object
				emp = new Employee();										//	Creating new Employee object every time
				
				System.out.print("Enter a Employee Name : ");
				String employeeName = userInput.next(); 
				emp.setEmployeeName(employeeName);							//	Setting the Employee Name of the object
				
				System.out.print("Enter the Salary : ");
				emp.setEmployeeSalary(userInput.nextLong());				//	Setting the Employee Salary of the object
				
				System.out.print("Enter the Designation : ");
				userInput.nextLine();										//	Setting the Employee Designation of the object
				emp.setEmployeeDesignation(userInput.nextLine());
				
				empTree.add(emp);											//	Adding it to the TreeSet of type Employee
			} else if (choice == 2) {										//	If Choice is 2 All the Elements in the TreeSet are displayed
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Entered Employee's List are -> ");
				for(Employee employee : empTree){							//	Loop to display the Employee objects
					System.out.println("Name ->	" + employee.getEmployeeName() + "	|	" + "Designation	->	" + employee.getEmployeeDesignation() + 
							"	|	" + "Salary	->	" + employee.getEmployeeSalary());
				}
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
			} else if (choice == 3) {										//	If Choice is 3 Exited from the Loop
				System.out.println("Exited ............... ");
				break;
			} else {														//	If User Enters any choice other than the provided
				System.out.println("Enter a Valid Choice ................ ");
				continue;
			}
		}

		userInput.close();													//	Closing the scanner stream to handle memory leak
	}}
