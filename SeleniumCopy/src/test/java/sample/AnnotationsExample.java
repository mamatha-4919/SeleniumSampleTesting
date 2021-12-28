package sample;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample 
{


  @BeforeSuite  //Executed 1st
  public void setUp()
  {
	  System.out.println("setup the system properties for chrome browser");
  }
  @BeforeTest   //2nd
  public void launchBrowser()
  {
	  System.out.println("launch chrome browser");
  }
  @BeforeClass   //3rd
  public void  enterUrl()
  {
	  System.out.println("enter the amazon website URL");
  }
  
  @BeforeMethod   //4th
  public void logInToAmazon()
  {
	  System.out.println("login to amazon website");
  }
  @Test (priority=4)  //5th
  public void signInTest()
  {
	  System.out.println("amazon login test passed");
  }
  @Test(priority=1)
  public void productAddToCart()
  {
	  System.out.println("selected product add to cart");
  }
  @Test (priority=2)
  public void navigateToPaymentPage()
  {
	  System.out.println("payment complted");
  }
  @Test(priority=3)
  public void backToHomePage()
  {
	  System.out.println("ordered completed back to home page");
  }
  @AfterMethod  //6th
  public void logOutFromAmazonsite()
  {
	  System.out.println("logout to the amazon site");
  }
  @AfterClass    //7th
  public void deleteCookies()
  {
	  System.out.println("delete the cookies");
  }
  @AfterTest   //8th
  public void closeBrowser()
  {
	  System.out.println("close the browser");
  }
 
  @AfterSuite  //Executed last(9th)
  public void generateTestReport()
  {
	  System.out.println("to generate the test reports");
  }
}


