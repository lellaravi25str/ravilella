package com.softq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIAuto 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("automation.gmail.com");
		
		
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("password");
		
		WebElement logoff = driver.findElement(By.id("SubmitLogin"));
		logoff.click();
		
		 String actval = driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/ol/li")).getText();;
		
		String expval="Invalid email address.";
		
		Assert.assertEquals(actval, expval);
		
	}

}
