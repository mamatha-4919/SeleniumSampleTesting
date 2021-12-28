package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ButtonTest
{
	@Test
	public void method1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/");	
	    WebDriverWait w=new WebDriverWait(driver,20);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Button']"))).click();	    
	    
	    
	    //driver.findElement(By.xpath("//*[text()='Button']")).click();
	    //Thread.sleep(5000);
	    
	    int x=driver.findElement(By.id("position")).getRect().getX();
	    System.out.println(x);
	    int y=driver.findElement(By.id("position")).getRect().getY();
	    System.out.println(y);
	    int size1=driver.findElement(By.id("size")).getRect().getHeight();
	    int size2=driver.findElement(By.id("size")).getRect().getWidth();
	    System.out.println(size1);
	    System.out.println(size2);

	    String color=driver.findElement(By.id("color")).getCssValue("background-color");
	    System.out.println(color);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("home"))).click();
	   // driver.findElement(By.id("home")).click();
	    driver.close();
	    
	    
	    }
}
