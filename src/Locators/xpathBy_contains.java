package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBy_contains {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("abhi@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("abhi123");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		   Thread.sleep(2000);
		   

	}

}
