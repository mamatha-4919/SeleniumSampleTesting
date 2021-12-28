package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestRadioButonsandCheckbox
{
 @Test
 public void Method1() throws Exception
 {
	 System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/");
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Radio Button']")));
	    //driver.findElement(By.xpath("//*[text()='Radio Button']")).click();
	WebElement radio1=driver.findElement(By.id("yes"));
	wait.until(ExpectedConditions.visibilityOf(radio1));
	    //radio1.click();
	    Thread.sleep(5000);
	    WebElement radio2=driver.findElement(By.name("news"));
	    wait.until(ExpectedConditions.visibilityOf(radio2));
	    //radio2.click();
	    WebElement radio3=driver.findElement(By.className("myradio"));
	    wait.until(ExpectedConditions.visibilityOf(radio3));
	    //radio3.click();
	    driver.close();
 }
 @Test
 public void method2() throws Exception
 {
	 System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/"); 
	    driver.findElement(By.xpath("//*[text()='Checkbox']")).click();
	    WebElement check1=driver.findElement(By.xpath("//*[@type='checkbox'])[3]"));
	    check1.click();
	    Thread.sleep(5000);
	    WebElement check2=driver.findElement(By.xpath("(//*[@type='checkbox'])[6]"));
	    System.out.println("The checkbox is selected : " + check2.isSelected());
	    driver.close();

	    
 }
}
