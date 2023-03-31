package com.java.OOPS.Genralization;

public class Test_PCB implements A1,A3
{

	@Override
	public void Biology() {
		System.out.println("I am Bio");
		
	}

	@Override
	public void Physics() {
		System.out.println("I am Physics");
	}

	@Override
	public void Chemistry() {
		System.out.println("I am Chemistry");
		
	}
public static void main(String[] args) 
{
	Test_PCB oi = new Test_PCB();
	{
		oi.Biology();
		oi.Chemistry();
		oi.Physics();
	}
}
}
