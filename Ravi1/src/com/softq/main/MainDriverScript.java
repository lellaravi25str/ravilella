package com.softq.main;

import org.testng.annotations.Test;

import com.softq.pages.BasePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MainDriverScript 
{
 
	WebDriver driver;
  
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
  }
  
  
  @Test
  public void login() 
  {
	  BasePage page=new BasePage(driver);
	  page.loginToApplication();
	  Assert.assertEquals("Authentication failed.", page.verifyErrorMsg());
  }

  @AfterMethod
  public void killProcess() 
  {
	  //driver.close();
  }

}
