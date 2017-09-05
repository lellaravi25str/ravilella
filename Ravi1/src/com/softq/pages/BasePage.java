package com.softq.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	
	@FindBy(linkText="Sign in")
	WebElement signIn;
	
	@FindBy(id="email")
	WebElement mail;
	
	@FindBy(id="passwd")
	WebElement pass;
	
	@FindBy(id="SubmitLogin")
	WebElement submit;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement verify;
	
	
	
	
	public BasePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void loginToApplication()
	{
		signIn.click();
		mail.sendKeys("qaautomation@gmail.com");
		pass.sendKeys("password");
		submit.click();
	}
	
	
	public String verifyErrorMsg()
	{
		return verify.getText();
	}
	
	

}
