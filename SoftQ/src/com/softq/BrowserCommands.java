package com.softq;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("weddriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://eenadupellipandiri.net/register");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("qtp");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("name")).clear();
		
		Thread.sleep(4000);
		
		driver.findElement(By.className("textlbl")).sendKeys("Selenium");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("RPA");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("Clear")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Register Now")).click();
	
	}

}
