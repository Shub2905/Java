package com.java.Array;

import java.util.Arrays;

public class Two_Dimensional 
{
public static void main(String[] args)
{  
	 int[][]a=new int[3][4];
	 a[0][0]=11;
	 a[0][1]=12;
	 a[0][2]=13;
	 a[0][3]=14;
	 a[1][0]=15;
	 a[1][1]=16;
	 a[1][2]=17;
	 a[1][3]=18;
	 a[2][0]=19; 
	 a[2][1]=20;
	 a[2][2]=21;
	 a[2][3]=22;
	 
	for(int[] ar:a)
	{System.out.println(Arrays.toString(ar));}
	
	
	for(int i=0;i<a.length;i++)
		for(int j=0; j<a[0].length;j++)
		{System.out.print (a[i][j]+" ");}
	System.out.println();
}
}
