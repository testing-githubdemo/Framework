package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partiallikktext_locator {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
        //   driver.findElement(By.partialLinkText("Create a")).click();
		   driver.findElement(By.partialLinkText("Forgotten ")).click();
	}

}
