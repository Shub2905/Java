package com.java.variable1;

public class Variable1 
{
	public static void main(String[] args) 
	{
		
		method1();
		method2();
		Variable1  obj5 =new Variable1();
		obj5.m1();
		obj5.m2();
	}
	
	
	int i=50;//N
	static int j=100;
	
	public void m1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
	}
	public void m2()
	{
		int b =20;
		System.out.println(b);
		System.out.println(i);
		System.out.println(j);
	}
    public static void method1()
    {
    	int c =30;
    	System.out.println(c);
    	System.out.println(j);
    }
    public static void method2()
    {
    	int f=j+j ;
    	System.out.println("i am addition "+f);
    }
}
