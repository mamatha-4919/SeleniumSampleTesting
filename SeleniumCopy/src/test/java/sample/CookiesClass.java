package sample;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CookiesClass
{
	@Test
	public void method1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
	    driver.get("https://www.amazon.in/");
	    //collect all cookies
	    Set<Cookie> ck=driver.manage().getCookies();
	    List<Cookie> li=new ArrayList<Cookie>(ck);
	    System.out.println("list of cookies is"+li.size());
	    for(Cookie c:li)
	    {
	    	System.out.println(c +" "+" "+c.getName()+" "+c.getDomain()+" "+c.getExpiry());
	    }
	    Cookie cookie_name=new Cookie("amazonTest","1234");
	    driver.manage().addCookie(cookie_name);
	    driver.manage().getCookieNamed("amaxonTest");
	    driver.manage().deleteCookieNamed("amazonTest");
	     driver.close();
		

		
	}

}
