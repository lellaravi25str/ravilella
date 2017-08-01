package com.softq;

public class ClassDemo 
{

	int eno=100;//instance Variables
	String ename="ravi"; //instance variables
	
	public void m1() //Instance Method
	{
		System.out.println("hi iam m1 method");
	}
	
	
	public static void main(String[] args) 
	{
		ClassDemo obj=new ClassDemo(); //Class Object Creation
		System.out.println("hi");
		System.out.println(obj.eno);
		System.out.println(obj.ename);
		obj.m1();
		
	}

}
