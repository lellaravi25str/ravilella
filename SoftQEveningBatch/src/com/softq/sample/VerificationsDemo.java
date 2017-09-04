package com.softq.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationsDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//String act_value = driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getText();
		String act_value = driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).getAttribute("innerHTML");
		String exp_val="Forgotten account?";
		
		System.out.println(act_value);
		System.out.println(exp_val);
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ravilella");
		
		
		
		//******************  Using with "equals()" method  ******************
		/*if(act_value.equals(exp_val))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}*/
		
		
		//***********  Using with "equalIgnoreCase()" method  ******************
		/*if(act_value.equalsIgnoreCase(exp_val))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}*/
		
		
		//Using "contains()" method -- checks with part of the text matching  and case also must match
		if(act_value.contains(exp_val))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
		
		
		
		//******************  Using "contentEquals()" method  ******************
		/*if(act_value.contentEquals(exp_val))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}*/
		
		
		//Using "getAttribute()" method
		
		
		String pg = driver.getPageSource();
		System.out.println(pg);

	}

}
