package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssetion2 {
	static WebDriver driver;
//@BeforeMethod
//public void setUp()
//{
//	System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
//	   driver=new ChromeDriver();
//	   driver.manage().window().maximize();
//	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	   driver.get("https://www.saucedemo.com/");
//}
@Test
public void username() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.get("https://www.saucedemo.com/");
 WebElement username=driver.findElement(By.id("user-name"));
  WebElement password=  driver.findElement(By.id("password"));
  
  //assetTrue
  Assert.assertTrue(username.isDisplayed());
  username.sendKeys("standard_user");
  
  Assert.assertTrue(password.isDisplayed());
  password.sendKeys("secret_sauce");
  
  //assertFalse
//  Assert.assertFalse(username.isDisplayed());
//  username.sendKeys("standard_user");//true expected false
//  
//  Assert.assertFalse(password.isDisplayed());
//  password.sendKeys("secret_sauce");
//  
  driver.findElement(By.id("login-button")).click();
  Thread.sleep(3000);
}
@Test
public void text() throws InterruptedException
{
	Thread.sleep(5000);
	boolean text=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();
	Assert.assertTrue(text);
	//Assert.assertEquals(text,true);
	
	
}

}
