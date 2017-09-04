package com.softq.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	
	@AfterMethod
	public void killProcess()
	{
		driver.quit();
	}
	
	
	@Test
	public void sbiBank()
	{
		driver.navigate().to("https://www.onlinesbi.com/");
		driver.findElement(By.xpath("//a[text()='BBPS Bill Pay']")).click();
	}

}
