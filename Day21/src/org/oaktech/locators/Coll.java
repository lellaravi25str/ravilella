package org.oaktech.locators;

import java.util.ArrayList;

public class Coll 
{

	private static final Object String = null;
	static ArrayList c=null;
	
	
	public static void main(String[] args) 
	{
		c=new ArrayList();
		c.add(10);
		c.add(20);
		c.add(20);
		c.add(30);
		c.add("ravi");
		c.add(10.00f);
		c.add('a');
		
		System.out.println(c);
		
		Object o1 = c.get(6);
		if(o1 instanceof Character)
		{
			//Integer str = (Integer)o1;
			System.out.println(o1);
		}
	}
}
