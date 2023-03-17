package com.java.OOPS_MLI;

public class Child extends Parent
{
public void Soap()
{
	System.out.println("I am Soap Method from Child classs in MLI package");
}
public void Wipes()
{
	System.out.println("I am Wipes Method from Child classs in MLI package");
}
public void Diaper()
{
	System.out.println("I am Diaper Method from Child classs in MLI package");
}


public static void main(String[] args) 
{
	Child obj = new Child();
	{
		obj.Patience();
		obj.Love();
		obj.Diaper();
	}
	com.java.OOPS_SLI.Parent oh = new com.java.OOPS_SLI.Parent();
			oh.Farmhouse();
}
}
