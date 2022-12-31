package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	  WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.get("https://kite.zerodha.com/");
	
	}
	@Test(priority=1)  
	public void kitelogoTest() {
		boolean b =driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=4)  
	public void forgetlink() {
		boolean b1=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
	System.out.println(b1);
	}
	@Test(priority=3)
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("Test3");
	}
	@AfterMethod   
	public void Teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
}
}


