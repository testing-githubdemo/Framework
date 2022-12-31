package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
	@Test
	public void m1()
	{
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  System.out.println("Hello");
		  Reporter.log("Test case1");
		  driver.quit();
	}
	@Test
	public void m2()
	{
		int i=5;
		int div=i/10;
		Reporter.log("Test Case2",true);
		System.out.println(div);
	}

}
