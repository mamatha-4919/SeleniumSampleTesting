package sample;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UnOrderList {
	@Test
	public void method1() throws InterruptedException, IOException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Selectable.html");
	    Thread.sleep(2000);
		List<WebElement> element=driver.findElements(By.xpath("//ul[@class='deaultFunc']/li"));
		System.out.println(element.size());
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.click(element.get(0)).perform();
		a.click(element.get(1)).perform();
		a.click(element.get(4)).perform();

		
		driver.findElement(By.xpath("//*[text()='Serialize ']")).click();
		Thread.sleep(4000);
		List<WebElement> ele=  driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
		Actions a1=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a1.click(ele.get(2)).perform();
		a1.click(ele.get(4)).perform();
		a1.click(ele.get(6)).perform();

		Thread.sleep(3000);
		String x="UnOrderList.png";
	     TakesScreenshot screenShot= ((TakesScreenshot)driver);
	     File source=screenShot.getScreenshotAs(OutputType.FILE);
	     File destination=new File(x);
	      FileHandler.copy(source, destination);
	      
	      
	      
Robot scrshot = new Robot();

	   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	 Rectangle rect = new Rectangle(screenSize);
BufferedImage src = scrshot.createScreenCapture(rect);

	  File dest = new File("Robot1.png");

	  ImageIO.write(src, "png", dest);
	  driver.close();
		
		
		
		
		
	}

}
