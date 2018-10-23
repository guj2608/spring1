package com.cg.springone.service;

public class Employee extends SBU {
	int employeeid;
	String emplyeeName;
	double salary;
	SBU businessUnit;
	int age;
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmplyeeName() {
		return emplyeeName;
	}
	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
   
	
	
	public void getDetails(){
		System.out.println("Employee Id : "+employeeid);
		System.out.println(" Employee  Name :"+emplyeeName);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee BU : "+businessUnit);
		System.out.println("Employee Age : "+age);
		System.out.println("SBU Id : "+businessUnit.SbuId);
		System.out.println(" SBU  Name :"+businessUnit.sbuName);
		System.out.println("SBU head : "+businessUnit.sbuHead);
			
			
		}
	}
