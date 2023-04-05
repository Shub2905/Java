package com.java.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class One_Dimensional 
{
public static void main(String[] args) 
{   // Approach one
	int[]a= {10,20,30,40,50};
	int[]b= {11,22,33,44,55,66,77,88,99};
	int[]c= {1,2,3,4,5,6};
	char[]d= {'a','b','c','d','e','f'};
	String[]e= {"shub2905","Diems","helloShub","world29"};
	

	  // Approach two
	int r [] =new int[5];
	r[0]=10;
	r[1]=50;
	r[2]=60;
	r[3]=58;
	r[4]=505;
	
	
	System.out.println(a[1]);//Accesing Particular Array
	System.out.println(b[2]);//Accesing Particular Array
	System.out.println(c[0]);//Accesing Particular Array
	System.out.println(d[1]);//Accesing Particular Array
	System.out.println(r[3]);//Accesing Particular Array
	System.out.println(a[4]);//Accesing Particular Array
	System.out.println(b[2]);//Accesing Particular Array
//	Arrays.sort(r);
	
	
	for(int ab:a)
	{System.out.print(ab+",");}
	
	for(int arr:r)
	{System.out.println(arr);}
	
	for(char arr:d)
	{System.out.println(arr);}
	
	for(int x=0;x<a.length;x++) {
		System.out.print(x);
	}
	
	
}
}
