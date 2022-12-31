package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
@BeforeMethod
@Parameters({"URL"})
public void setUp(String URL)
{
	System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(URL);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
}
@Test
@Parameters({"Username","password"})
public void loginPage(String Username,String password)
{
	driver.findElement(By.id("user-name")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
}
@AfterMethod
public void TearDown()
{
	driver.quit();
}
}
