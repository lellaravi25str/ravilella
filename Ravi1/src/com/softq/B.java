package com.softq;

public class B extends A
{

	public void m2()
	{
		System.out.println("Hi iam m2 method from class B");
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		
		B b=new B();
		b.m1();
		b.m2();
		

	}

}
