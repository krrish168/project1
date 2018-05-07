package com.qsp.bigbasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BigBasket_HomePage
{
	@FindBy(xpath="(//img[@alt='Service Guarantee Image'])[6]")
	private WebElement multiPacksBTN;
	
	@FindBy(xpath="//a[.='Continue']")
	private WebElement Popup;
	
	public BigBasket_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void handlePopup()
	{
		Popup.click();
	}
	
	public void multipacksOption()
	{
		multiPacksBTN.click();
	}
	
}