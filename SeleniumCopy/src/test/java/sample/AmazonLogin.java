package sample;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonLogin {
	@Test

	public void method1() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='nav-line-2 '] "))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("8179841464");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")))
				.sendKeys("Mamatha14");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInSubmit"))).click();
		//product add to cart
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys("money plant");
		driver.findElement(By.id("nav-search-submit-button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='s-image'])[2]"))).click();
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
driver.switchTo().window(parentId);
		
		
//Logout 
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[14]")).click();
		Thread.sleep(3000);

		driver.close();
	}


}
