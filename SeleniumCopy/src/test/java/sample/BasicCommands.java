package sample;


import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicCommands
{
	@Test
    
	public  void method() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Register.html");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("http://leafground.com/pages/Edit.html");
	driver.manage().window().minimize();
	Dimension d=new Dimension();
	d.setSize(200,250);  
	driver.quit();
	}
	

}
