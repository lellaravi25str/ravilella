package com.softq.dummy;

public class MetyhodOverLoading 
{

	int m1(float f)
	{
		System.out.println("float arg method");
		return 10;
	}

	
	public static void main(String[] args) 
	{
		MetyhodOverLoading a=new MetyhodOverLoading();
		a.m1(10);
		
		a.m1(10.90f);
		
		String s=new String("ravi");
		

	}

}
