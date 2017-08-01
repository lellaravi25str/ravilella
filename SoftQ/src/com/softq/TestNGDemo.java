package com.softq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void xyz()
	{
		 driver.findElement(By.xpath("//a[text()='BBPS Bill Pay']")).click();
	}
	
	
	@Test
	public void abc()
	{
		 driver.findElement(By.xpath("//a[text()='BBPS Bill Pay']")).click();
	}
	
	
	@Test
	public void pqr()
	{
		 driver.findElement(By.xpath("//a[text()='BBPS Bill Pay']")).click();
	}
	
	
	@AfterMethod
	public void killProcess()
	{
		driver.quit();
	}
	

	

}
