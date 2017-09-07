package org.oaktech.locators;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Excep 
{
	static  int nr,dr,q=0;
	static String str="null";
	
	static void m1() throws FileNotFoundException
	{
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ravilella\\Documents\\input1.txt"));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nr value : ");
		 nr = sc.nextInt();
		
		System.out.println("enter dr value : ");
		 dr = sc.nextInt();
		 
		 try
		 {
			 q=nr/dr;
			 System.out.println(q);
			 int slen = str.length();
			 System.out.println(slen);
			 q=20;
			 System.out.println(q);
			 
		 }
		 
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		/*catch(ArithmeticException e)
		 {
			e.printStackTrace();
			//System.out.println("dr should be greater than zero");
		 }
		 catch(NullPointerException e)
		 {
			 e.printStackTrace();
		 }*/
		
		
	}
	
	public static void main(String[] args) 
	{
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
