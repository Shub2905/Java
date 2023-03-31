package com.java.task3103;

public class JIo implements Interface
{
	public void Netflix()
	{
		System.out.println("Netflix is our offering");
	}

	@Override
	public void sms() {
		System.out.println("SMS from JIo ");
		
	}

	@Override
	public void Call() {
		System.out.println("Calling from Jio ");
		
		
	}

	@Override
	public void Internet() {
		System.out.println("Internet from JIo ");
		
		
	}
	
	public static void main(String[] args) {
		JIo obj = new JIo();
				obj.Call();
				obj.Netflix();
				obj.Internet();
				obj.sms();
	}
}
