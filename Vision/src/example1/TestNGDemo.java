package example1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGDemo 
{
	
  @Test(priority=0, enabled=false)
  public void gmail() 
  {
	  System.out.println("testmethod gmail");
  }
  
  
  @Test(priority=1)
  public void facebook() 
  {
	  System.out.println("testmethod facebook");
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After Suite");
  }

}
