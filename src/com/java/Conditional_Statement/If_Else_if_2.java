package com.java.Conditional_Statement;

import java.util.Scanner;

public class If_Else_if_2 
{
public static void main(String[] args)

{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks Scored");
	
	int marks_Scored = sc.nextInt();
	
	if (marks_Scored>=90)
		{System.out.println("Congratulations you are above 90 ");}
	else if(marks_Scored>80 && marks_Scored<=90)
		System.out.println("Congratulations you are above 80 ");
	else if(marks_Scored>70 && marks_Scored<=80)
		System.out.println("Congratulations you are above 70");
	else if(marks_Scored>60 && marks_Scored<=70)
		System.out.println("Congratulations you are above 60");
	else if(marks_Scored>50 && marks_Scored<=60)
		System.out.println("Congratulations you are above 50");
	else if(marks_Scored>=35 )
		System.out.println("Pass");
	else if(marks_Scored<35 )
		System.out.println("Satvi Fail");
	else
		System.out.println(" Unexpected error");
}
}