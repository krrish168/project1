package com.qsp.bigbasket_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qsp.bigbasket.BigBasket_HomePage;
import com.qsp.bigbasket.BigBasket_Login_Page;
import com.qsp.bigbasket.BigBasket_MultiPackPage;

public class Bigbasket_ValidLogin_Test 
{
	@Test//======Test method to execute and calling the pom classes
	public void LoginandLogout() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		BigBasket_Login_Page blp=new BigBasket_Login_Page(driver);
		
		BigBasket_HomePage bhp=new BigBasket_HomePage(driver);
		
		BigBasket_MultiPackPage bmp=new BigBasket_MultiPackPage(driver);
		
		PageFactory.initElements(driver, blp);
		PageFactory.initElements(driver, bhp);
		PageFactory.initElements(driver, bmp);
		
		driver.get("https://www.bigbasket.com/auth/login/?nc=nb/");
		blp.enterUserName("varusy019@gmail.com");
		Thread.sleep(1000);
		blp.enterPassword("bbasket@12345");
		Thread.sleep(1000);
		blp.loginButton();
		Thread.sleep(2000);
		//bhp.handlePopup();
		//Thread.sleep(2000);
		bhp.multipacksOption();
		Thread.sleep(5000);
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		//bmp.tropicanaQuantity("5");
		bmp.tropicanaPack(driver);
		Thread.sleep(4000);
		bmp.morteinPack(driver);
		Thread.sleep(3000);
		bmp.cartMenuOptions(driver);
		Thread.sleep(2000);
		bmp.closeSelectedOptions();
		Thread.sleep(5000);
		bmp.logoutButton(driver);
		
	}
}