package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkes2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		  // driver.get("https://www.amazon.in/");
		   driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		   List<WebElement> links=driver.findElements(By.tagName("a"));
			  System.out.println("Total number of Links present in webPage:"+links.size());
			  int brokenlinks=0;
			  for(WebElement element:links)
			  {
				  String url=element.getAttribute("href");
				  if(url==null ||url.isEmpty())
				  {
					  System.out.println("Url is Empty");
					  continue;
				  }
				  URL link=new URL(url);
				  HttpURLConnection httpcode=(HttpURLConnection)link.openConnection();
				  httpcode.connect();
				  if(httpcode.getResponseCode()>=400)
				  {
				
					System.out.println(httpcode.getResponseCode()+"---"+url+"----"+"Broken Liks");  
					brokenlinks++;
				  }
				  else
				  {
					
					  System.out.println(httpcode.getResponseCode()+"---"+url+"---"+"Valid Links");
				  }
				  
				  
				  }
			  Thread.sleep(2000);
			  System.out.println("No of broken links"+brokenlinks);
			
			  }

}
