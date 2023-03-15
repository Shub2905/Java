package com.java.Constructor;

public class Default_Constructor {

	public static void main(String[] args)
	{
	//main start
		Default_Constructor obj = new Default_Constructor();
		obj.m1();
		
// main end
	}
	
	
	int a;
	String s;
	char c;
	boolean z;
	byte w;
	float t;

	public void m1()
	{
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
		System.out.println(z);
		System.out.println(t);
		System.out.println(w);
	}
}
