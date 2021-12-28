package sample;


import java.util.List;

import org.junit.jupiter.engine.discovery.DiscoverySelectorResolver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTesting 
{
	@Test
	 public void Method1() throws Exception
	 {
		 System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://leafground.com/");
		  driver.findElement(By.xpath("//*[text()='Drop down']")).click();
		  Thread.sleep(3000);
		  //locate dropdown in webpage
		  WebElement e=driver.findElement(By.id("dropdown1"));
		  Select s=new Select(e);
		  //select the item from dropdown
		  s.selectByVisibleText("Selenium");
		  //s.selectByIndex(0);
		 // s.selectByValue("2");
		  WebElement e1=driver.findElement(By.name("dropdown2"));
		  Select s1=new Select (e1);
		  s1.selectByVisibleText("Loadrunner");
		  //s1.selectByIndex(3);
		  WebElement e2=driver.findElement(By.id("dropdown3"));
		  Select s3=new Select(e2);
		  s3.selectByValue("2");
		  
		  WebElement e3=driver.findElement(By.id("dropdown4"));
		  Select s4=new Select(e3);
		  List<WebElement> list=s3.getOptions();
		  System.out.println(list.size());
		  for(WebElement i:list)
		  {
			  System.out.println(i.getText());
		  }
		  WebElement e4=driver.findElement(By.xpath("//*[text()='You can also use sendKeys to select']"));
		  Select s5=new Select (e4);
		  s4.selectByIndex(2);
		  driver.close();
		  
		  
	 }
		

}
