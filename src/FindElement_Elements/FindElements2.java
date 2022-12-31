package FindElement_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   //Size of links
		List<WebElement>All_links=   driver.findElements(By.xpath("//a"));
		System.out.println("Number of links present in facebook page:"+All_links.size());
		//Print all links present in webpage
		for(int i=0;i<All_links.size();i++)
		{
			System.out.println(All_links.get(i).getText());
		}
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   driver.quit();
	}

}
