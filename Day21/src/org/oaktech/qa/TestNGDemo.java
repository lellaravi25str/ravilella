package org.oaktech.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo 
{

	@AfterClass
	public void killProcess()
	{
		System.out.println("killprocess");
	}
	
	
	
	@BeforeClass
	public void setup()
	{
		System.out.println("setup");
	}
	
	@Test(priority=0)
	public void xyz()
	{
		System.out.println("xyz");
	}
	
	
	@Test(priority=1 , enabled=false)
	public void abc()
	{
		System.out.println("abc");
	}
	
	
	@Test(priority=2)
	public void pqr()
	{
		System.out.println("pqr");
	}
	

}
