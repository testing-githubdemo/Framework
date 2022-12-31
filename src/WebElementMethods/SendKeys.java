package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		  
		//webElement-It is represent HTML element in DOM structure,generally all operations on web page will  be perfrom through webElement
	
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		//sendKeks()-return type WebElement.
	 //sendKey-This method is use to enter value in the input field.
		 //  driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
		   //2.clear()-
		   Thread.sleep(2000);
		  // driver.findElement(By.xpath("//input[@id=\"email\"]")).clear();
		   
		 
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("demo123@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("abc123");
		   Thread.sleep(2000);
		   
		   
		   
	
	
	
	}

}
