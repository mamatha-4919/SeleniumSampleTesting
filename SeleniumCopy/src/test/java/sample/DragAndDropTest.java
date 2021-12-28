package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest 
{
	@Test
	public void Method1() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Static.html");
	    driver.findElement(By.xpath("//img[@id='angular']")).click();
	    Thread.sleep(2000);
	    WebElement e=driver.findElement(By.xpath("//div[@id='droparea']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(e).perform();
	    /*int x=e.getLocation().getX();
	    int y=e.getLocation().getY();
	    a.moveByOffset(x+20, y+5).perform();*/
	    Thread.sleep(5000);
	    driver.close();

	}

}
