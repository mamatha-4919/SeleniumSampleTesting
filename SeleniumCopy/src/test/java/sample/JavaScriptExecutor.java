package sample;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor
{
	@Test
	public void method1() throws Exception, IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/Button.html");
        Thread.sleep(4000);	 
        JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("document.getElementById('home').click();");
      //creating an alert
      js.executeScript("window.alert('i am alert box');");
      Thread.sleep(5000);
      driver.switchTo().alert().dismiss();
      //page scrolling
      js.executeScript("window.scrollBy(0,document.body.scrollHeight);");


      Thread.sleep(2000);
      js.executeScript("window.scrollBy(document.body.scrollHeight,0);");
      Thread.sleep(4000);

      driver.close();
	}
    //disable an element

	@Test
	public void method2() throws Exception, IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/Button.html");
        Thread.sleep(4000);	 
        JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("document.getElementById('home').setAttribute('disabled','true' );");
      Thread.sleep(5000);
      js.executeScript("document.getElementById('home').removeAttribute('disabled');");
       driver.close();
		
	}
}








