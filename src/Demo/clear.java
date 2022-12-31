package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Rahul");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("12344");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Ketan");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();

}

}
