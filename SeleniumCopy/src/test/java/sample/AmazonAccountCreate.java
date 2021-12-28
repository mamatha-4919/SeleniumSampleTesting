package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonAccountCreate
{
	@Test
	
	public void method1() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.xpath("//*[text()='Account & Lists']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("createAccountSubmit")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("customerName")).sendKeys("Mamatha");
	    driver.findElement(By.name("email")).sendKeys("8179841464");
	    driver.findElement(By.name("password")).sendKeys("Mamatha14");
	    driver.findElement(By.id("ap_password_check")).sendKeys("Mamatha14");
	    driver.findElement(By.id("continue")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("pvSubmit")).click();
	    Thread.sleep(2000);

	    

	}

}
