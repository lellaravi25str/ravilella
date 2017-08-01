package com.softq;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit 
{
		WebDriver driver;
		
	@Before
	public void init()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.navigate().to("https://eenadupellipandiri.net/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void eenadu()
	{
		
		driver.findElement(By.id("name")).sendKeys("sathish");
	}
	
	@After
	public void killProcess()
	{
		driver.close();
	}
	

}
