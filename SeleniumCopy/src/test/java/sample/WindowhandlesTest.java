package sample;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowhandlesTest
{
	@Test
	public void  testMethod1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Windows.html");
		String window_title1=driver.getTitle();
		driver.findElement(By.xpath("//*[@class='btn btn-info']")).click();
		Set<String> win=driver.getWindowHandles();
		Iterator<String> iter=win.iterator();
		String x=iter.next();
		String y=iter.next();
     driver.switchTo().window(y);	
		String window_title2=driver.getTitle();
		System.out.println(window_title1+"  "+window_title2);
		driver.quit();
		}
}
