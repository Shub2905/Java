package com.java.Conditional_Statement;

import java.util.Scanner;

public class Switch_case {
  public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
{System.out.println("Enter case to run ");}
int day = sc.nextInt();



sc.close();

switch(day) {
case 1 :
	System.out.println("Monday");
	break;
case 2 :
	System.out.println("Tuesday");
	break;
case 3 :
	System.out.println("Wenesday");
	break;	
case 4 :
	System.out.println("Thursday");
	break;	
case 5 :
	System.out.println("Friday");
	break;	
case 6:
	System.out.println("SaturdY");
	break;	
case 7 :
	System.out.println("sunday");
	break;	
default:
	System.out.println("INvalid entry");
}
}
}
