package example1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit 
{

	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	}
	
	@Test
	public void googlePage()
	{
		
	}
	
	@After
	public void killProcess()
	{
		
	}
	
	
	
	

}
