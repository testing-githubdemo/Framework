package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		   Thread.sleep(2000);
		  // driver.switchTo().alert().accept();
		   driver.switchTo().alert().dismiss();
		   Thread.sleep(1000);
		   driver.quit();

	}

}
