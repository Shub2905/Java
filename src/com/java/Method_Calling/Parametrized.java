package com.java.Method_Calling;

public class Parametrized 
{
public static void main(String[] args) 
{
	sub(50, 40);
	sub(80, 8);
}

public static void sub(int a, int b) {
int c = a+b;
System.out.println(c);
}
}
