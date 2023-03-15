package com.java.Constructor;

public class paramter_Constructor 
{
	int a;
	int b;
	
	
	public void m1(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) 
	{
	// start 
		paramter_Constructor ob = new paramter_Constructor();
		ob.m1(50,50);
		
		//end
	}

}
