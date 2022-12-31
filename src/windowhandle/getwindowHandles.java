package windowhandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://omayo.blogspot.com/");
		   String windowID=driver.getWindowHandle();
		   driver.findElement(By.linkText("Open a popup window")).click();
		   
		
		   System.out.println("Parent Window Id: "+windowID);
		   Set<String> windows=driver.getWindowHandles();
		   Iterator<String>it=windows.iterator();
		   while(it.hasNext())
		   {
			   String window1=it.next();
			   driver.switchTo().window(window1);
			 if( driver.getTitle().equals("Basic Web Page Title"))
			 {
				 driver.close();
			 }
				 
		}
		   driver.switchTo().window(windowID);
		   driver.findElement(By.name("q")).sendKeys("Hello");
		   
		   
		   
		
	}

}
