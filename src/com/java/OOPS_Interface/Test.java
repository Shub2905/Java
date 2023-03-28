package com.java.OOPS_Interface;

public class Test
{
public static void main(String[] args) 
{
	Implement_class obj =new Implement_class();
	
	{
		obj.m1();
		obj.m2();
	}
	Oppo ob1= new Oppo();
	{
		ob1.Battery();
		ob1.Camera();
		ob1.Ram();
	}
	Samsung ob2= new Samsung();
	{
		ob2.Battery();
		ob2.Camera();
		ob2.Ram();
	}
	
}
}
