package BrokenLinks;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		  List<WebElement> links=driver.findElements(By.tagName("a"));
		  System.out.println("Total number of Links present in webPage:"+links.size());
		  //print all links persent in webpage
		  for(int i=0;i<links.size();i++)
		  {
			  System.out.println(links.get(i).getAttribute("href"));
			  
			  //getAttribute()-This method is declare the webElement interface, and 
			  //it return the value of the webElement attribute as a string .This method return true or null
		  }
	}

}