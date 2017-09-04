package com.softq.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://eenadupellipandiri.net/register");
		
		driver.manage().window().maximize();
		
		WebElement ename = driver.findElement(By.id("name"));
		ename.sendKeys("ravilella");
		
		String val = ename.getAttribute("value");
		//String val = ename.getText();
		System.out.println("Entered text value is : " + val);
		
		
		driver.findElement(By.className("textlbl")).clear();
		
		driver.findElement(By.name("name")).sendKeys("softq");
		
		driver.findElement(By.className("textlbl")).clear();
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@value='F']")).click();
		
		//Thread.sleep(3000);
		
		//WebElement link = driver.findElement(By.partialLinkText("Register"));
		//link.click();
		
	
	}

}
