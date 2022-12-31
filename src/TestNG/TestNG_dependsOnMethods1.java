package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_dependsOnMethods1 {
	 static  WebDriver driver;
		@Test(priority=2)
		public void saucedemogetText() throws InterruptedException
		{
			 Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//div[@id=\"login_credentials\"]")).getText();
		System.out.println(text);
		}
		@Test(priority = 1) 
		public void saucedemoTitle() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			   driver.get("https://www.saucedemo.com/");
			   String title= driver.getTitle();
			   Thread.sleep(3000);
				System.out.println(title);
			
		}		
		@Test(priority=3)
		public void saucedeomloginTest() throws InterruptedException
		{
			 Thread.sleep(3000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
		}
		@Test(priority = 2, dependsOnMethods = {"saucedeomloginTest"})
		public void addTOCart() throws InterruptedException
		{
			Thread.sleep(3000);
			String text= driver.findElement(By.xpath("(//div[@class=\"inventory_item_name\"])[1]")).getText();
			System.out.println(text);
		}
		@Test(priority=4)
		public void test1() throws InterruptedException
		{
			 Thread.sleep(3000);
			System.out.println("test1");
		}
		@Test(priority=5)
		public void test2() throws InterruptedException
		{
			 Thread.sleep(3000);
			System.out.println("test2");
		}
		
	}
