package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.RegistrationPage;

public class RegistartionPageTest
{
@Test
    
	public  void method() throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.get("https://www.amazon.in/");
    Thread.sleep(2000);
    RegistrationPage ele=new RegistrationPage();
	ele.signin_button(driver).click();
	ele.createacc(driver).click();
	ele.name(driver).sendKeys("mamatha");
	ele.number(driver).sendKeys("8179841464");
	ele.password(driver).sendKeys("Mamatha14");
	ele.confrimpassword(driver).sendKeys("mamatha14");
	ele.continue_button(driver).click();
	

}
}
