package examples;

import java.util.Scanner;

public class Z 
{
	int nr,dr;
	int q=0;
	String str=null;
		
	public static void main(String[] args) throws Exception 
	{	
		Z z=new Z();
		z.m1();//method call
	}
	
	 void m1() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter nr");
		nr=sc.nextInt();
		System.out.println("please enter dr");
		dr=sc.nextInt();
			 q=nr/dr;
			 System.out.println(q);
			 System.out.println("Length of the string is: "+ str.length());	 	
	}

}
