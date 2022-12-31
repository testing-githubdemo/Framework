package DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   
		  driver.get("https://www.facebook.com/");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("demo123@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("abc123");
		   Thread.sleep(2000);
		   
		   

	}

}
