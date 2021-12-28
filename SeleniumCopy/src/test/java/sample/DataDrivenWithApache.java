package sample;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DataDrivenWithApache
{
@Test
    
	public  void method() throws IOException 
{
	System.setProperty("webdriver.chrome.driver","E:\\SeleniumtrainingHCL\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    
FileInputStream file=new FileInputStream("E://SeleniumtrainingHCL//Book1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(file);
XSSFSheet s1=wb.getSheet("Sheet1");
int rowcount=s1.getLastRowNum();
int colmcount=s1.getRow(0).getLastCellNum();
for(int i=1;i<s1.getLastRowNum();i++) {
	XSSFRow r1=s1.getRow(i);
	String username = r1.getCell(0).getStringCellValue();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	  driver.findElement(By.id("ap_email")).sendKeys("9703204919");
	  driver.findElement(By.id("continue")).click();

}
}
}