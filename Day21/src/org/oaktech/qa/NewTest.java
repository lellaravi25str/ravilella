package org.oaktech.qa;

public strictfp class NewTest 
{
	public int i=10;
	public static int s=20;
	
	//public abstract void m1();

  public void f() 
  {
	  int i=30;
	  System.out.println("test in Newtest Class : " + i);
	  System.out.println("static variable : "+ s);
  }
  
  
  public void g() 
  {
	  System.out.println("test in Newtest Class : " + i);
	  System.out.println("static variable : "+ s);
  }
  
  
 
}
