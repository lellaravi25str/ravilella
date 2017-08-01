package com.softq;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WenElements 
{
  
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		ChromeDriver driver=new  ChromeDriver();
		driver.navigate().to("https://eenadupellipandiri.net/register");
		
		String act_value = driver.findElement(By.linkText("Register Now")).getAttribute("class");
		String exp_value="Register";
		
		System.out.println(act_value);
		System.out.println(exp_value);
		
		if(act_value.equals(exp_value))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
	}

}
