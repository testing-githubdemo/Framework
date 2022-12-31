package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox6 {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		   String day="//select[@id=\"day\"]//option";
		   String month="//select[@id=\"month\"]//option";
		   String year="//select[@id=\"year\"]//option";
		   
		   String s1="23-Jan-2010";
		   String date[]=s1.split("-");
		   selectlist(day, date[0]);
		   selectlist(month, date[1]);
		   selectlist(year, date[2]);
		   driver.quit();
		   
	}
	public static void selectlist(String element,String value)
	{
		List<WebElement>list=driver.findElements(By.xpath(element));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals(value))
			{
				list.get(i).click();
				break;
				
			}
		}
	}

	 
}
