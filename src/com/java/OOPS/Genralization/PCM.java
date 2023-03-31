package com.java.OOPS.Genralization;

public class PCM extends B {

	@Override
	public void Math() {
		System.out.println("I am Math Called From Class B");
		
	}

	@Override
	public void Physics() {
		System.out.println("I am Physics Called From Class A");
		
	}

	@Override
	public void Chemistry() {
		System.out.println("I am Chemistry Called From Class A");
		
	}
public static void main(String[] args) 
{
	PCM job1 =new PCM();
	{
		job1.Math();
		job1.Chemistry();
		job1.Physics();
	}
}
}
