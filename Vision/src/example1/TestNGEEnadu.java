package example1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGEEnadu 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://eenadupellipandiri.net/register");
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  
	}
	
	
  @Test
  public void eenadu() 
  {
	  driver.findElement(By.id("name")).sendKeys("ravilella");
  }
  
  
  @Test
  public void eenadu1() 
  {
	  driver.findElement(By.id("name")).sendKeys("ravilella");
  }
  
  

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
