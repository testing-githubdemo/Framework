package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		  // Alert alt=driver.switchTo().alert();
		   //Alert is an interface-Which provides abstract methods 
		   //1.accept()-click on Ok button-void
		   //2.dismiss()-click on cabcel button-void
		   //3.getText()-use to get text present in alert popup-String
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();

	}

}
