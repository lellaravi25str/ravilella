package com.softq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	int i=10;
	long l=287766;
	byte b=127;
	String s="ravi";
	
	public static void m1(String s,int i,ChromeDriver driver,long l)
	{
		
	}

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://eenadupellipandiri.net/register");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("name")).sendKeys("ravilella");
		
		driver.findElement(By.name("name")).clear();
		
		driver.findElement(By.className("textlbl")).sendKeys("prabhu");
		
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("deva");
		
		//driver.findElement(By.linkText("Register Now")).click();
		
		driver.findElement(By.partialLinkText("Register")).click();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++)
		{
			if(!list.get(i).getText().isEmpty())
			{
				String var = list.get(i).getText();
				System.out.println(var);
			}	
		}
		
	}
}
