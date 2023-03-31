package com.java.OOPS.Genralization;

public class Test_PCM implements A1,A2
{

	@Override
	public void Math() {
		System.out.println("I am Math");
		
	}

	@Override
	public void Physics() {
		System.out.println("I am PHy");
		
	}

	@Override
	public void Chemistry() {
		System.out.println("I am Chem");
		
	}
public static void main(String[] args)
{
	Test_PCM ob = new Test_PCM();
	{
		ob.Chemistry();
		ob.Math();
		ob.Physics();
	}
}

}
