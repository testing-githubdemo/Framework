package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Locator{

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://login.yahoo.com/");
         driver.findElement(By.className("phone-no")).sendKeys("abc2@yahoo.com");
         //driver.findElement(By.xpath("//input[@name=\"signin\"]")).click();
         driver.findElement(By.className("pure-button")).click();
         //driver.findElement(By.cssSelector("input.pure-button.puree-button-primary.challenge-button")).click();
         
    
	}

}
