package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://login.yahoo.com/");
		   driver.findElement(By.name("username")).sendKeys("demo@yahoo.com");
		   driver.findElement(By.name("signin")).click();

	}

}
