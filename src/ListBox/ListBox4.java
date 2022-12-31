package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		  WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		  WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		  Thread.sleep(2000);
		  String dob="23-4-1996";
		  String date[]=dob.split("-");//date[0]-23,date[1]-4,date[2]-1996
		  ListBox(day, date[0]);
		  ListBox(month, date[1]);
		  ListBox(year, date[2]);
		  
		  

	}
	public static void ListBox(WebElement element,String value)
	{
		Select s1=new Select(element);
		s1.selectByValue(value);
	}

}
