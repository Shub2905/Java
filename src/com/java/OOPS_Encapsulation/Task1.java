package com.java.OOPS_Encapsulation;

public class Task1 
{
	public static void main(String[] args) 
	{
		//main start
		
		Task1 obj = new Task1();
		obj.setEmpid(0, 50, 50, 500);
		System.out.println(obj.getEmp());
		
		
		//main end
	}
	 private int empid;
	 private int follwer;
	 private int follwing;
	 private int post;
	 
	 public void setEmpid(int eid,int foll_a,int foll_b,int post1)
	 {
		 empid=eid;
		 follwing=foll_a;
		 follwer=foll_b;
		 post=post1;
		 
	 }

	 public int getEmp()
	 {
		 return empid;
	 }
	 public int getpost()
	 {
		 return post;
	 }
	 public int getfollwer()
	 {
		 return follwer;
	 }
	 public int getfoll()
	 {
		 return follwing;
	 }
	 
	 
}