package com.java.OOPS_Interface;

public class Samsung implements Interface_mobile
{

	@Override
	public void Camera() {
		System.out.println("i am from Samsung 48 Mp");
		
	}

	@Override
	public void Ram() {
		System.out.println("i am from Samsung 4 GB");
		
	}

	@Override
	public void Battery() {
		System.out.println("i am from Samsung 5000 Mh");
		
	}

}
