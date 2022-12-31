package FindElement_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		//1.  
//		   List<WebElement> links1=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
//		  System.out.println("Number of elements"+links1.size());
//		   for(int i=0;i<links1.size();i++)
//		   {
//			   System.out.println(links1.get(i).getText());
//		   }
//		   for(WebElement link:links)
//		   {
//			   System.out.println(link.getText());
//		   }
		   //2
//		   List<WebElement> links=driver.findElements(By.xpath("//a[@class=\"nav-  \"]"));
//			  System.out.println("Number of elements"+links.size());	
		   
		   List<WebElement> links=driver.findElements(By.xpath("//a[@class=\"nav-  \"]")); 
		   
	}



}
