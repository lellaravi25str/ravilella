package com.softq.sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MultiBrowser 
{
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  System.out.println("Hi this is testng test1");
  }
  
  
  @Test
  public void a() 
  {
	  System.out.println("Hi this is testng test2");
  }

  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  driver.get("http://www.amazon.in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() 
  {
	 driver.close(); 
  }
  

}
