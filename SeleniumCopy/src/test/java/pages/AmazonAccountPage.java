package pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAccountPage {
	WebDriver driver;
	//user signin page
	By signIn_Button = By.xpath("//*[@class='nav-line-2 '] ");
	By userName = By.name("email");
	By continue_button = By.id("continue");
	By password = By.xpath("//*[@type='password']");
	By signIn_Submit = By.id("signInSubmit");
	//product add to cart
	By searchBox=By.id("twotabsearchtextbox");
	By click_search=By.id("nav-search-submit-button");
	By click_product=By.xpath("(//*[@class='s-image'])[2]");
	By addto_cart=By.xpath("//input[@name='submit.add-to-cart']");
	
	
	public AmazonAccountPage(WebDriver driver)
	{
		this.driver=driver;

	}

	public void click_signinbutton() 
	{
		driver.findElement(signIn_Button).click();
	}
	public void  type_username() 
	{
		driver.findElement(userName).sendKeys("8179841464");
		
	}
	public void click_continuebutton()
	{
		driver.findElement(continue_button).click();
		
	}
	public void typepassword()
	{
		driver.findElement(password).sendKeys("Mamatha14");
	}
	public void click_submitButton()
	{
		driver.findElement(signIn_Submit).click();
		
	}
	public void type_insearchBox()
	{
		driver.findElement(searchBox).sendKeys("money plant");
	}
	public void click_searchButton()
	{
		driver.findElement(click_search).click();
	}
	public void click_select_product()
	{
		driver.findElement(click_product).click();
	}
	public void  add_Cart()
	{
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        //driver.findElement(By.name("submit.add-to-cart")).click();
		driver.findElement(addto_cart).click();
		}

	
}
