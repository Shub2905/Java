package com.java.Conditional_Statement;
import java.util.*;

public class If_else_if_1 {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner (System.in);
	
		
	int mobile_price=100000;
	System.out.println("Enter Your Budget");
	int Balance = sc.nextInt();
	 if(mobile_price<=Balance )
	 {System.out.println("You can buy Apple");}
	 else if(mobile_price==90000)
		 {System.out.println("You can Buy Samsung");}
	 
	 else if(mobile_price==80000)
		 {System.out.println("You can Buy Ramson");}
	 else if(mobile_price==70000)
		 {System.out.println("You can Buy One plus");}
	
	 else if(mobile_price==55000)
	 { System.out.println("You can Buy Motorola");}

	 else if(mobile_price==25000)
		 {System.out.println("You can Buy VIvi");}
	 
	 else if(mobile_price==5000)
		 {System.out.println("JA Fakir Purana PHone hi Vapar");}
	 
	 else 
	 {
		 System.out.println(" Lena Dena Bank se Loan Le lo");
	}

}
}