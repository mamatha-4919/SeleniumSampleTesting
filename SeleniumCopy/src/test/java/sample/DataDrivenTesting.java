package sample;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting 
{
@Test
    
	public void method1() throws Exception, IOException, BiffException
	{
		FileInputStream input=new FileInputStream("src\\test\\java\\practice\\Config.properties");
		Properties pt=new Properties();
		pt.load(input);
		String bn=pt.getProperty("BrowserName");
		String bp=pt.getProperty("browser_Path");
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",bp);
			WebDriver driver=new ChromeDriver();
			
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", bp);
			WebDriver driver=new FirefoxDriver();


		}
		else
		{
			System.setProperty("webdriver.edge.driver", bp);
			WebDriver driver=new EdgeDriver();
		}
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
  Workbook w1=Workbook.getWorkbook(new File("E://SeleniumtrainingHCL//Book1.xlsx"));
  Sheet s1=w1.getSheet("Sheet1");
  for(int i=1;i<s1.getRows();i++) 
  {
	  String username=s1.getCell(0, i).getContents();
	  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	  driver.findElement(By.id("ap_email")).sendKeys("9703204919");
	  driver.findElement(By.id("continue")).click();
	  driver.close();
	  
  }
}

}
