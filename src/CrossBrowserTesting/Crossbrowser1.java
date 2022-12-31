package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser1 {
	WebDriver driver;
	@Parameters("Browsername")
@Test
public void login(String Browsername)
{
	if(Browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(Browsername.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Datta Patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	else if(Browsername.equals("firefox"))
	{
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Datta Patil\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		  driver=new FirefoxDriver();
	}
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	
}
}
