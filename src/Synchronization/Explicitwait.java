package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		  
		   driver.get("https://www.google.co.in/");
		   driver.manage().window().maximize();
		   driver.findElement(By.name("q")).sendKeys("cheese"+Keys.ENTER);
		   WebElement value=new WebDriverWait(driver,Duration.ofSeconds(25)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
		   value.click();
		   Thread.sleep(2000);
		String text=   driver.findElement(By.xpath("//h1[@id=\"firstHeading\"]")).getText();
		  System.out.println(text);
		   driver.quit();
		   
		   

	}

}
