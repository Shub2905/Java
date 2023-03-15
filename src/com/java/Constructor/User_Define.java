package com.java.Constructor;

public class User_Define 
{
public static void main(String[] args) 
{//start
	User_Define on = new User_Define();
	on.m1();
	
	
	//end
	
}

int a;
String b;
boolean c;
User_Define() 
{
	a=10;
	b="Shub";
    c= true ;
}
public void m1()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
}

}
