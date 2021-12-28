package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage
{
	WebDriver driver;
		public  WebElement signin_button(WebDriver driver) {
			return driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		}
		public WebElement createacc(WebDriver driver) 
		{
			this.driver=driver;
			return driver.findElement(By.id("createAccountSubmit")); 

	}
		public WebElement name(WebDriver driver)
		{

			
			return driver.findElement(By.id("ap_customer_name"));
		}
		public WebElement number(WebDriver driver) {
			return driver.findElement(By.id("ap_email"));
		}
		public WebElement password(WebDriver driver) {
			return driver.findElement(By.id("ap_password"));
		}
		public WebElement confrimpassword(WebDriver driver) {
			return driver.findElement(By.id("ap_password_check"));
		}
		public WebElement continue_button(WebDriver driver) {
			return driver.findElement(By.id("continue"));
		
		
		
		}
	}