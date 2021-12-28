package stepDef;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 40);

	//   SignIn  to Amazonwebsite

    @Given ("^  www.amazon.com site in Chrome Browser $")
    public void user_open_the_AmazonWebsiteInChromeBrowser() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    
    	
    }
    @And ("^ click on signIn button $")
    public void user_clickSignIn_Button( )
    {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='nav-line-2 '] "))).click();
		
    	
    }
   @Then ("^ enter the valid user credential $")
   public void user_enter_the_details()
   {
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("8179841464");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")))
				.sendKeys("Mamatha14");
		
	   
   }
   @And ("^  click the signIn button and user in home page $")
   public void user_click_signInButton()
   {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInSubmit"))).click();

	   
   }
   //Product add to cart
   @When ("^ click on product search box $")
   public void click_on_theSearchBox()
   {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys("money plant");

   }
   @And ("^click search button$")
   public void user_clickSearchButton()
   {
		driver.findElement(By.id("nav-search-submit-button")).click();

	   
   }
   @Then ("^click the product whitch item  user likes$")
   public void click_userSelectedProduct()
   {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='s-image'])[2]"))).click();

	   
   }
  @And ("^click on add to cart$")
  public void click_productAddtoCart(WebDriver driver)
  {
	  Set<String> ids = driver.getWindowHandles();
      Iterator<String> it = ids.iterator();
      String parentId = it.next();
      String childId = it.next();
      driver.switchTo().window(childId);
     driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
      driver.switchTo().window(parentId);
	  
  }
  @Then ("^back to HomeLogout from amazon Website$4")
  public void logout_from_amazonWebSite(WebDriver driver) throws Exception
  
  {
	  Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[14]")).click();
		Thread.sleep(3000);

		driver.quit();
  }
}