package org.oaktech.qa;

public class JavaBasicPrgm 
{

	int sno=100;
	String sname="ravikanth";
		
	void m1()
	{
		System.out.println("Hi iam m1 method");
	}
	
	
	void m2()
	{
		System.out.println("Hi iam m2 method");
	}
	
	
	public static void main(String[] args) 
	{
		JavaBasicPrgm obj=new JavaBasicPrgm();	
		
		System.out.println(obj.sno);
		System.out.println(obj.sname);
		
		obj.m1();
		obj.m2();
		
		
	}

}
