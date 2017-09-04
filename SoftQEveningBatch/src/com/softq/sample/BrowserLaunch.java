package com.softq.sample;

public class BrowserLaunch 
{

	int i=100;
	float f=10.00f;
	
	
	public void m1()
	{
		System.out.println("Hi iam m1 methid from class BrowserLaunch");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		
		BrowserLaunch b=new  BrowserLaunch();
		System.out.println(b.i);
		System.out.println(b.f);
		
		b.m1();
	}

}
