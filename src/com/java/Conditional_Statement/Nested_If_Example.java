package com.java.Conditional_Statement;

import java.util.Scanner;

public class Nested_If_Example {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Your age");
		int age = sc.nextInt();
		sc.close();
		if(age>=18 && age>=21)
			System.out.println("You can MArry and Elegible to vote");
		if(age<=18)
		{System.out.println("You Cannot Vote");
		
		if(age<=21)
		{System.out.println("You Cannot marry ");}
		if(age<18 && age<21)
			
			System.out.println("Cannot Marry and Vote");
		else
			
		{System.out.println("You are a Minor to mary");
		
		}
		}

		else {
			System.out.println("Thankyou ");
		}
	}

}
