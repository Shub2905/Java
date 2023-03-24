package com.java.Abstraction;

abstract public class Abstract 
{
abstract public void m1();
public void m2()
{
System.out.println(" M 2 is Complete");	
}
public void m3()
{
System.out.println(" M 3 is Complete");	
}
abstract public void m4();



public static void main(String[] args) 
{
	Concrete obj=new Concrete();
			{
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
			}
}
}

