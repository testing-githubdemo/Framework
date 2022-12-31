package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_EnableKeyword {
	//Q.enabled=false-when we don't want to execute any test case then we use @Test(enabled=false)then specificed enabled test case will be not executed.
	//IT will work like comment
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
	@Test(enabled=true)
	public void loginpageTitle()
	{
		String title= driver.getTitle();
		System.out.println(title);
	}
	@Test(enabled=false)
	public void gettext()
	{
		String text=driver.findElement(By.xpath("//div[@id=\"login_credentials\"]")).getText();
		System.out.println(text);
	}
	@Test(enabled=true)
	public void loginData()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@AfterMethod
	public void Teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
