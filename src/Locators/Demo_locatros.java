package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_locatros {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.redbus.in/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Swargate, Pune");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//li[@data-id='67159']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//li[@data-id=\"462\"]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		   Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class=\"current day\" and contains(text(),'30')]")).click();
		  // driver.findElement(By.xpath("//td[@class=\"next\"]/button")).click();
		  // driver.findElement(By.xpath("//td[@class=\"wd day\" and contains(text(),'2')]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("search_btn")).click();
		  Thread.sleep(5000);
		 //  driver.close();
		   

	}

}
