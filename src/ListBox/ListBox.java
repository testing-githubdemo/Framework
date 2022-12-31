package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		  //System.setProperty("webdriver.edge.driver","C:\\Users\\Datta Patil\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		  // WebDriver driver=new EdgeDriver();
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Datta Patil\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		 Select s=new Select(day);
		   Thread.sleep(2000);
		// s.selectByValue("10");
		//   s.selectByVisibleText("29");
		   s.selectByIndex(3);
		
		   
		   
		   
		   

	}

}
