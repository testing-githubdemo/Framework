package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2_byName {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.automationtesting.in/Frames.html");
		   //frame by id
		   driver.switchTo().frame("singleframe");
		  // Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Welcome");
		   Thread.sleep(2000);
		   driver.switchTo().defaultContent();
		   driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		   Thread.sleep(2000);
		  // driver.quit();

	}

}
