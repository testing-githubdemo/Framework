package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitlywait {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		  
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		   driver.findElement(By.id("email")).sendKeys("helleo@gmail.com");
		   driver.findElement(By.id("pass")).sendKeys("1234A");
		   driver.findElement(By.name("login")).click();
		   driver.quit();
		   

	}

}
