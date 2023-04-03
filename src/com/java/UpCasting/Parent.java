package com.java.UpCasting;

public class Parent extends child
{
public void m1()
{
System.out.println("m1");	
}
public void m2()
{
System.out.println("m2");	
}
public void m3()
{
System.out.println("m3");	
}
public void m6()
{
System.out.println("m6");	
}
public static void main(String[] args) 
{
//	child obj=new Parent();
//	obj.m1();
	Parent obj=(Parent) new child();
	obj.m10();
}
}
