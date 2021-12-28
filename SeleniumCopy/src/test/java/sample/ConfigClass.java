package sample;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;


public class ConfigClass 
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
			driver.get("https://www.amazon.in/");
			Thread.sleep(4000);
			driver.close();
			
		}
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", bp);
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.leafground.com/home.html");
			Thread.sleep(4000);

			driver.close();

		}
		else
		{
			System.setProperty("webdriver.edge.driver", bp);
			WebDriver driver=new EdgeDriver();
			driver.get("http://demo.automationtesting.in/Windows.html");
			driver.close();
		}
	}}