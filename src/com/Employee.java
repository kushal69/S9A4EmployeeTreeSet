package com;

//	POJO Class Employee which contains properties defining the same.
public class Employee {
	//	Properties of Employee
	private String employeeName;
	private long employeeSalary;
	private String employeeDesignation;
	
	//	Getters and Setters of Properties for Employee where it is used access the private properties of Employee
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
}
