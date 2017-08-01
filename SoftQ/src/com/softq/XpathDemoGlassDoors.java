package com.softq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemoGlassDoors 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.glassdoor.co.in");
		
		//driver.findElement(By.xpath("//div[@class='prefooter-module-col'][1]/ul[1]/li[6]/a")).click();

		
		 WebElement morelink = driver.findElement(By.xpath("//div[@class='prefooter-module-col'][1]/ul[1]/li[6]/a"));
		 morelink.click();
		 
	}

}
