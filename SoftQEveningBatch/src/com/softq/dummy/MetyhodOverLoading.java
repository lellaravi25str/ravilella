package com.softq.dummy;

public class MetyhodOverLoading 
{

	/*public void m1(int i)
	{
		System.out.println("int arg method:" +i);
	}*/
	
	
	int m1(float f)
	{
		System.out.println("float arg method");
		return 10;
	}
	
	
	/*public void m1(String s)
	{
		System.out.println("string arg method");
	}*/
	
	
	/*public void m1(Object o)
	{
		System.out.println("string arg method");
	}*/

	
	public static void main(String[] args) 
	{
		MetyhodOverLoading a=new MetyhodOverLoading();
		a.m1(10);
		
		a.m1(10.90f);
		
		String s=new String("ravi");
		a.m1(s);

	}

}
