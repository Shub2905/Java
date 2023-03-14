package com.java.Method_Calling;

//import com.java.DiffPack.DiffPackDiffClass;
import com.java.DiffPack.DiffPackDiffClass_NonStatic;

public class Same_Class_NonStatic 
{
public static void main(String[] args) 
{
Same_Class_NonStatic obj = new Same_Class_NonStatic();
obj.method1();
obj.method2();
Diffrent_Class_NonSttic obj1 = new Diffrent_Class_NonSttic();
obj1.method3();
obj1.method4();
DiffPackDiffClass_NonStatic obj2 = new DiffPackDiffClass_NonStatic();
obj2.method5();
obj2.method6();

Diffrent_Class.method5();
	
}

public void method1()
{
System.out.println("I am Non static method1 from same class");
}
public void method2()
{
System.out.println("I am Non static method2 from same class");
}
}

