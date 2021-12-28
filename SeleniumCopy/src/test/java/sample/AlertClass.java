package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertClass 
{

		@Test
		public void Method1() throws Exception
		{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    //Thread.sleep(4000);
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-toggle='tab']")));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@onclick='alertbox()']")));

	 //driver.findElement(By.xpath("//*[@data-toggle='tab']")).click();
	    
	  //driver.findElement(By.xpath("//*[@onclick='alertbox()']")).click();
	  //Thread.sleep(5000);
	    driver.switchTo().alert().accept();
	    driver.close();
		}
		@Test
		public void method2() throws Exception
		{
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://demo.automationtesting.in/Alerts.html"); 
		    WebDriverWait wait=new WebDriverWait(driver,20);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Alert with OK & Cancel ']"))).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='click the button to display a confirm box ']"))).click();
		    driver.switchTo().alert().accept();

	       
	  //driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']")).click();
	  //Thread.sleep(3000);

	    //driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']")).click();
	    //Thread.sleep(5000);

	   // String x1=driver.switchTo().alert().getText();
	   // System.out.println(x1);
	    driver.close();
		}
		@Test
		public void method3() throws Exception
		{
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://demo.automationtesting.in/Alerts.html"); 
		    driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		    
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		    Thread.sleep(3000);
	        String x=driver.switchTo().alert().getText();
	        System.out.println(x); 
	        driver.switchTo().alert().sendKeys("Mamatha");
	        driver.switchTo().alert().accept();
	        driver.close();	
	    }
	 
	}