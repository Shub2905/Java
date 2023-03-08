package com.java.Method_Calling;

import com.java.DiffPack.DiffPackDiffClass;

public class Same_class 
{public static void main(String[] args)
{
		
	method1();
	method2();
	Diffrent_Class.method5();// write Class_name.method_name
	Diffrent_Class.method6();
	DiffPackDiffClass.method3();
	DiffPackDiffClass.method4();
	
	
	
	
	
	
}
public static void method1() // Instead of method 1 you can take any name // Whenever there is static keyword  in method it is static method and vice-versa 
{
	System.out.println("Staic Mwthod 1 called From Same Class");
}

public static void method2() 
{
	System.out.println("Staic Mwthod 2 called From Same Class");
}




}
