package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox3 {
	//not executed
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(3000);
	          WebElement day    = driver.findElement(By.id("day"));
	          WebElement Month  = driver.findElement(By.id("month"));
	          WebElement Year   = driver.findElement(By.id("year"));
	 
		}
		public static void Selectdropdown(String xpath, String Values) {
			
			List<WebElement>S1 =driver.findElements(By.xpath(xpath));
			
			System.out.println(S1.size());
			
			for(int i=0 ;i<S1.size();i++) {
				System.out.println(S1.get(i).getText());
				if(S1.get(i).getText().equals(Values)) {
					S1.get(i).click();
				}
			}
		}

	}