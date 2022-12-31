package TestNG;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNGPriorites {
	//Q.how will u execute your test caese in a sequence manner?
	//ans-using priority keyword
	  WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		//keywords-priority
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.get("https://www.saucedemo.com/");
	
	}
	@Test(priority=2)
	public void saucedemogetText()
	{
	String text=driver.findElement(By.xpath("//div[@id=\"login_credentials\"]")).getText();
	System.out.println(text);
	}
	@Test(priority=1) 
	public void saucedeomloginTest()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(priority=4)
	public void saucedemoTitle()
	{
		String title= driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=3)
	public void test2()
	{
		System.out.println("test2");
	}
	
	
@AfterMethod//3  6
public void TearDown() throws InterruptedException
{
	  Thread.sleep(3000);
	  driver.quit();
}
}



