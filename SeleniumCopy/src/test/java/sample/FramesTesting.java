package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FramesTesting 
{
@Test 
	public  void method() throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
  
	driver.get("http://demo.automationtesting.in/Frames.html");
	Thread.sleep(2000);
    WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Single Iframe')]"))).click();

	//driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")));
	//driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(1);
	WebElement frame=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div/iframe"));	
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nestedframe");
	driver.switchTo().parentFrame();
	driver.quit();

	

}

}
