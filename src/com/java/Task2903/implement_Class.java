package com.java.Task2903;

public class implement_Class implements InterfaceC
{
public static void main(String[] args)
{
	implement_Class obj =new implement_Class();
	{
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
		obj.m6();
	}
}

@Override
public void m5() {
	System.out.println("i am From Interface C");
	
}

@Override
public void m6() {
	System.out.println("i am From Interface C");
	
}

@Override
public void m3() {
	System.out.println("i am From Interface B");
	
}

@Override
public void m4() {
	System.out.println("i am From Interface B");
	
}

@Override
public void m1() {
	System.out.println("i am From Interface A");
	
}

@Override
public void m2() {
	System.out.println("i am From Interface A");
	
}
}
