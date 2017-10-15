package com;

import java.util.Comparator;
//	Class EmployeeComparator implements Comparator to Compare between two objects
public class EmployeeComparator implements Comparator<Employee>{
	//	Overriding the compare method of the Comparator Interface
	//	@param obj0 = First Employee Object in the comparison
	//	@param obj1 = Second Employee Object in the comparison
	@Override
	public int compare(Employee obj0, Employee obj1) {
		
		Employee emp1 = obj0;					//	User defined object 1
		Employee emp2 = obj1;					//	User defined object 2
		
		if(emp1.getEmployeeSalary() < emp2.getEmployeeSalary()){									//	Comparing the Salary of 2 employees
			return -1;
		} else if(emp1.getEmployeeSalary() > emp2.getEmployeeSalary()){								//	Comparing the Salary of 2 employees
			return 1;
		} else if(emp1.getEmployeeSalary() == emp2.getEmployeeSalary()){							//	If 2 employees have same salary
			if(!(emp1.getEmployeeName().equalsIgnoreCase(emp2.getEmployeeName()))){					//	Comparing the Alphabetic order of the employee names
				return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());					
			} else {																				//	If 2 employees have same name then we are comparing 
				return emp1.getEmployeeDesignation().compareTo(emp2.getEmployeeDesignation());		//	Comparing the Alphabetic order of the employee designation 
			}
		} else {
			return 0;
		}
	}
}