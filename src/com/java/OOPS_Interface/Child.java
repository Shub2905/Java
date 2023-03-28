package com.java.OOPS_Interface;

public class Child implements Interface1,Interface2
{

	@Override
	public void met3() {
		System.out.println("i am from Interface 2");
		
	}

	@Override
	public void met4() {
		System.out.println("i am from Interface 2");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void met1() {
		System.out.println("i am from Interface 1");
		
	}

	@Override
	public void met2() {
		System.out.println("i am from Interface 1");
		
	}

	public static void main(String[] args) 
	{
		Child objk = new Child();
		objk.met1();
		objk.met2();
		objk.met3();
		objk.met4();
	}
}
