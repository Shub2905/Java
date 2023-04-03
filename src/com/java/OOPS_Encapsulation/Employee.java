package com.java.OOPS_Encapsulation;

public class Employee 
{	

public static void main(String[] args) 
{
	//main start
	
	Employee obj = new Employee();
	obj.setEmpid(10001);
	System.out.println(obj.getEmp());
	
	//main end
}
 private int empid;
 public void setEmpid(int eid)
 {
	 empid=eid;
	 
 }

 public int getEmp()
 {
	 return empid;
 }
 

}
