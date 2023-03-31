package com.java.OOPS.Genralization;

public class PCB extends C {

	@Override
	public void Biology() {
		System.out.println("I am Biology Called From Class C");
		
	}

	@Override
	public void Physics() {
		System.out.println("I am Physics Called From Class A");
		
	}

	@Override
	public void Chemistry() {
		System.out.println("I Cmemistry Ch Called From Class A");
		
	}

	public static void main(String[] args)
	{
		PCB job =new PCB();
		{
			job.Biology();
			job.Chemistry();
			job.Physics();
		}
	}
}
