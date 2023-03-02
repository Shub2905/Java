package com.java.basic;

import java.util.Scanner;

public class Scanner_Class
{
public static void main(String[] args) 
{
	int Balance = 50000;
	int pin= (0002);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amount");  // getting amount
	int Amount =sc.nextInt();            // to a varStoring it in var
	System.out.println("Enter your pin "); //Getting Pin
	int Pin = sc.nextInt();                //Storing pin
	if(Amount>Balance)
	{System.out.println("Insufficent Fund");}
	
	
	int Up_Balance = Balance-Amount;
	if(pin!=Pin)
	{System.out.println("Unathorised Acces");}
	
	if(Pin==pin)
	System.out.println("Your Available Dhanrashi is "+ Up_Balance);
	

	
	
	
}
}
