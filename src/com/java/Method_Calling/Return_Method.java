package com.java.Method_Calling;

public class Return_Method 
{
public static void main(String[] args) 
{
//main start
	
	System.out.println(Return());//method 1 to call
	int x = Return();// method 2 to call 
	System.out.println(x);
 System.out.println(Ur());
	
//main end
}
public static int Return() // Here Return is Method name
{
	int a=50;
	int b=30;
	int c=a*b;
	return c; // return is a keyword
}

public static String Ur()
{
	String h = "HEllo";
	return h;
	
}
}
