package sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditTest
{
@Test
public void method1() throws Exception
{
	
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://leafground.com/");
    WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Edit']")));    
    //driver.findElement(By.xpath("//*[text()='Edit']")).click();
    //Thread.sleep(5000);
    driver.findElement(By.id("email")).sendKeys("tomamatha.n@gmail.com");
    driver.findElement(By.name("username")).sendKeys("mamatha");
    driver.findElement(By.name("username")).clear();
    Thread.sleep(5000);

     WebElement e=driver.findElement(By.xpath("//*[text()='Confirm that edit field is disabled']"));
     if(e.isDisplayed())
     {
    	 System.out.println("element is visible");
    	 if(e.isSelected())
    	 {
    		 System.out.println("element is selected");
    	 }
    	 else
    	 {
    		 System.out.println("element not selected");
    	 }
     }
     else
     {
    	 System.out.println("element is disabled");
     }
    driver.close();
}
}
