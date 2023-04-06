package com.java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Array_sort 
{
	public static  void Assending()
	{
		int []a= {1,3,5,7,9,11,2,4,6,8,10};
		Arrays.sort(a);
		for(int i=0;i< a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
	
	public static  void Dessending()
	{
		
	}
public static void main(String[] args)

{
	Integer []b= {1,3,5,7,9,11,2,4,6,8,10};
	Arrays.sort(b,Collections.reverseOrder());
	System.out.println(b);
	
 System.out.println("***********************");
	Assending();
}

	
}
