package com.softq.sample;

import java.util.Scanner;

class C 
{
	static int nr,dr,q=0;
	static String s=null;
	
	static void m1()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numerator:" );
		nr=sc.nextInt();
		
		System.out.print("Enter Denominator: ");
		dr=sc.nextInt();
		
		
		try
		{
			q=nr/dr;
			
			//System.out.println("Enter the string : ");
			//s=sc.next();
			s.length();
			
			//System.out.println("hi");
			//System.out.println("hello");
			
		}
		
		
		
		
		/*catch(ArithmeticException e)
		{
			System.out.println("Denominator should be greater than zero....");
			m1();
		}*/
		
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Denominator should be greater than zero....");
			//m1();
		}
		
		
		
		finally
		{
			System.out.println(q);
			System.out.println(s);
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		m1();
	}
	

}
