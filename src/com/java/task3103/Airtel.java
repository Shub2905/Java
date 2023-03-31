package com.java.task3103;

public class Airtel implements Interface
{
public void hotstar()
{
	System.out.println("hotstar is our offering");
}

@Override
public void sms() {
	System.out.println("SMS from Airtel ");
	
}

@Override
public void Call() {
	System.out.println("Calling from Airtel ");
	
	
}

@Override
public void Internet() {
	System.out.println("Internet from Airtel ");
	
	
}
public static void main(String[] args)
{

	Airtel obj = new Airtel();
			obj.Call();
	obj.hotstar();
	obj.Internet();
	obj.sms();
	
}
}
