package com.softq;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		
		driver.navigate().to("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		
		
		String var = driver.getTitle();
		System.out.println(var);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.close();
		
		driver.quit();
		
		

	}

}
