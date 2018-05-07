package com.qsp.bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BigBasket_Login_Page 
{
	@FindBy(name="username")
	private WebElement usernameTextBox;
	
	@FindBy(name="password")
	private WebElement passwordTextBox;
	
	@FindBy(name="Submit")
	private WebElement loginBTN;
		
	public BigBasket_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname)
	{
		usernameTextBox.sendKeys(uname);
	}
	
	public void enterPassword(String paswd)
	{
		passwordTextBox.sendKeys(paswd);
	}
	
	public void loginButton()
	{
		loginBTN.click();
	}

}