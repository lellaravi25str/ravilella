package org.oaktech.locators;

import java.util.HashSet;

public class HashSet1 
{

	public static void main(String[] args) 
	{
		HashSet<Integer>  hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		
		System.out.println(hs);
	}

}
