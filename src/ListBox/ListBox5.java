package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {
	  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		  WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		  WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		 
		
		  

	}
	public static void SelectListBox(String xpath,String value)
	{
		List<WebElement> s1=driver.findElements(By.xpath(xpath));
		System.out.println(s1.size());
		for(int i=0;i<s1.size();i++)
		{
			System.out.println(s1.get(i).getText());
			if(s1.get(i).getText().equals(value))
			{
				s1.get(i).click();
			}
		}
		
		
	}

}
