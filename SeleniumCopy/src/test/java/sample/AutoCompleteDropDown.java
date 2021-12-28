package sample;



import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class AutoCompleteDropDown 
{
	@Test
	public void method1() throws Exception
	{
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://demo.automationtesting.in/AutoComplete.html");
    
    driver.findElement(By.id("searchbox")).sendKeys("ab");
    Thread.sleep(4000);
    List<WebElement> ele=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
    for(WebElement list:ele)
    {
    	if(list.getText().equalsIgnoreCase("saudi arabia"))
    	{
    		list.click();
    		break;
    		
    	}
    	else
    	{
    		System.out.println("no element found");
    	}
    	
    }
    String img="Autocomplete.png";
    TakesScreenshot screenShot= ((TakesScreenshot)driver);
    File src=screenShot.getScreenshotAs(OutputType.FILE);
    File dest=new File(img);
    FileHandler.copy(src, dest);
    
    
    Robot scrshot = new Robot();

	   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	 Rectangle rect = new Rectangle(screenSize);
BufferedImage src1 = scrshot.createScreenCapture(rect);

	  File dest1 = new File("Robot.png");

	  ImageIO.write(src1, "png", dest1);
	  driver.close();
	}
}
		

    
    
    
     /*WebElement textbox=driver.findElement(By.id("searchbox"));
     textbox.sendKeys("india");
     Thread.sleep(3000);
     textbox.sendKeys(Keys.ARROW_DOWN);
     textbox.sendKeys(Keys.ARROW_DOWN);
     textbox.sendKeys(Keys.ENTER);
     String x="Autocomplete.png";
     TakesScreenshot screenShot= ((TakesScreenshot)driver);
     File src=screenShot.getScreenshotAs(OutputType.FILE);
     File dest=new File(x);
     FileHandler.copy(src, dest);*/
	