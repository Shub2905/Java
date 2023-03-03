package com.java.Conditional_Statement;

import java.util.Scanner;

public class Nested_if 

{
public static void main(String[] args) 


{
	Scanner sc =new Scanner(System.in);{
			
	String Uname =sc.toString();
	//String Uname ="Shub28905";
	System.out.println("PLease Enter Your User id");
	String Pass = "Pass@123";
	if(Uname=="Shub2905")
	{System.out.println("User  id exists");
	if (Pass=="Pass@123")
	{System.out.println("Success");}
	else
	{System.out.println("Password Error");
	}
	}
else 
{System.out.println("USer Dosent exsis");
	}
}
}
}
