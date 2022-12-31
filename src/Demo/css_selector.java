package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   //driver.get("https://login.yahoo.com/");
	       driver.get("https://app.hubspot.com/");
        
		Thread.sleep(3000);
		
		
		//1.id
//		driver.findElement(By.cssSelector("#username")).sendKeys("Test@123");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#password")).sendKeys("QQ123");

		//2.name
//		driver.findElement(By.cssSelector("input#username")).sendKeys("Test@123");
//		driver.findElement(By.cssSelector("input#password")).sendKeys("!@$$");
		
		//3.class
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("Rohit@gmail.com");
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("233eeeee");
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("span.UICheckbox_PrivateCheckboxIcon-p67e4e-4.fQGnYw.private-checkbox_dash")).click();
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("#loginBtn")).click();
	}
	

}