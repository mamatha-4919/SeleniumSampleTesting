package test;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import pages.AmazonAccountPage;



public class AmazonLoginTest 
{
	@Test
	public void loginTestmethod() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    AmazonAccountPage user=new AmazonAccountPage(driver);
	    user.click_signinbutton();
	    user.type_username();
	    user.click_continuebutton();
	    user.typepassword();
	    user.click_submitButton();
	    //product add to cart
	    user.type_insearchBox();
	    user.click_searchButton();
	    Thread.sleep(2000);

	    
	    user.click_select_product();
	    Thread.sleep(2000);

	    user.add_Cart();
	    Thread.sleep(2000);
	    
	    	    

	  //Logout 
	  		Actions a = new Actions(driver);
	  		WebElement ele = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	  		a.moveToElement(ele).build().perform();
	  		Thread.sleep(3000);
	  		driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[14]")).click();
	  		Thread.sleep(3000);
	    driver.quit();
	    
	    
		
	}

}
