package sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTesting
{
	@Test(priority=2)
	public void testWithChrome() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leafground.com/");
	    driver.close();

	}
	@Test(priority=1)
	public void testWithFireFox()
	{
		System.setProperty("webdriver.edge.driver","E:\\SeleniumtrainingHCL\\edgedriver_win64\\edgedriver.exe");
	   WebDriver driver=new EdgeDriver();
	    driver.get("http://leafground.com/");
	    driver.close();

	}
}
