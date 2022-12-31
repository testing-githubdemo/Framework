package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class saucedemo1 {
	  WebDriver driver;
	@BeforeMethod//1 4
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.get("https://www.saucedemo.com/");
	
	}
	@Test //5
	public void saucedeomloginTest()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test//2
	public void saucedemoTitle()
	{
		String title= driver.getTitle();
		System.out.println(title);
	}
	
  @AfterMethod//3  6
  public void TearDown() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
