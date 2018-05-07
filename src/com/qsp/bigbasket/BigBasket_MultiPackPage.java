package com.qsp.bigbasket;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BigBasket_MultiPackPage
{
	/*@FindBy(xpath="//input[@class='form-control ng-pristine ng-valid ng-not-empty ng-valid-maxlength ng-touched']")
	private WebElement tropicana;*/
	
	@FindBy(xpath="(//button[@class='btn btn-add col-xs-9'])[6]")
	private WebElement addBTN1;
	
	@FindBy(xpath="(//button[@class='btn btn-add col-xs-9'])[7]")
	private WebElement addBTN2;
	
	@FindBy(xpath="//span[@class='basket-content']")
	private WebElement cartMenu;
	
	@FindBy(xpath="//div[@class='item-remove']")
	private List<WebElement> close1;
	
	@FindBy(xpath="//span[.='Varun']")
	private WebElement varun;
	
	@FindBy(xpath="(//a[.='Logout'])[1]")
	private WebElement LogoutBTN;
		
	public BigBasket_MultiPackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	/*public void tropicanaQuantity(String n)
	{
		tropicana.click();
		tropicana.clear();
		tropicana.sendKeys(n);
	}*/
	public void tropicanaPack(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(addBTN1).click().perform();
		//addBTN1.click();
	}
	
	public void morteinPack(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(addBTN2).click().perform();
	}
	
	public void cartMenuOptions(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(cartMenu).click().perform();
	}
	
	public void closeSelectedOptions()
	{
		for(WebElement end:close1)
		{
			end.click();
		}
	}
	public void logoutButton(WebDriver driver) throws InterruptedException
	{
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String scrollUp="window.scrollBy(0,-1000)";
		jse.executeScript(scrollUp);
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(varun).click().perform();
		LogoutBTN.click();
	}
}