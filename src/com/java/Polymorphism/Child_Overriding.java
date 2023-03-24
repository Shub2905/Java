package com.java.Polymorphism;

public class Child_Overriding extends Parent_overriding
{
public void car()
{
	System.out.println("i am car method from child Overriding");
}
public void bike()
{
	System.out.println("i am bike method from child Overriding");
}
public void house()
{
    System.out.println("i am house method from child Overriding");
}
public void carry()
{
	System.out.println("gygh");
}
public static void main(String[] args) 
{
	Child_Overriding obj= new Child_Overriding();
	{
	obj.house();
	
		
	}
	
	Parent_overriding obj1 = new Parent_overriding();
	{
		obj1.bike();
		obj1.house2();
	}
}
}
