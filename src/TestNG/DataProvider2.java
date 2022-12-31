package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	WebDriver driver;
	@Test(dataProvider = "LoginTestData")
	//@dataprovider annotaion helps us write data-driven test cases.
	//The @DataProvider annotation enables us to run a test method multiple times by passing differant data sets. 
	public void LoginTest(String Uasername,String password)
	{
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("user-name")).sendKeys(Uasername);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.quit();
	}
	
	@DataProvider(name="LoginTestData")
	
	public Object[][] logindata()
	{
		Object[][] data=new Object[4][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		data[1][0]="standard_user";
		data[1][1]="secret_sa";
		
		data[2][0]="standard_data";
		data[2][1]="secret_sauce";
		
		data[3][0]="standard_data";
		data[3][1]="standard_data";
		return data;
		
	}
	
	

}
