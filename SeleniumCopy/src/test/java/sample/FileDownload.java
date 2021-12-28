package sample;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class FileDownload 
{
	@Test
	public void method1() throws Exception, IOException
	{
		//creating an empty folder
	    System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/download.html");
	    //download file
	   driver.findElement(By.xpath("//*[text()='Download Excel']")).click();
	   Thread.sleep(4000);
	   driver.close();
	}
	   @Test
	   public void method2() throws Exception, IOException
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.ilovepdf.com/pdf_to_word");
		    driver.manage().deleteAllCookies();
		    driver.findElement(By.xpath("//*[text()='Select PDF file']")).click();
		    Thread.sleep(3000);
		    String file="C:\\Users\\lenovo\\Downloads";
	   StringSelection ss=new StringSelection(file);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	   Robot r=new Robot();
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_V);
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);

	   driver.findElement(By.xpath("//*[text()='Convert to WORD']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("pickfiles")).click();
	    driver.close();

	}
}
