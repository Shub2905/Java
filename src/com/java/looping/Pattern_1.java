package com.java.looping;

public class Pattern_1 
{
public static void pattern1(int n)
{
	for(int row =1;row<=n;row++)
		for(int col=1; row<=col;col++)
			{System.out.print("*");}
	        System.out.println();
}
public static void main(String[] args) {
	pattern1(5);
}
}
