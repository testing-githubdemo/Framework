package Selenum_Concepts;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program1 {

	public static void main(String[] args) throws InterruptedException {
		//System-class
		//setProperty-method
		// WebDriver-interface
		//ChromeDriver-class
	   System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   
	   //WebDriver methods-
	   //1.get()-It is ues to open application or enter URL in a WebDriver
	  driver.get("https://www.facebook.com/");
	   
	   //2.close-It is use to close current tab of the browser
	   //driver.close();
	   
	   //3.quit-This is alternative methos of close (),but the difference is when we ues a quit() all tabs are close which is open in browser
	  // driver.quit();
	   
	   //4.getTitle()-It returns title on page as an output
	   
	   String title=driver.getTitle();
	   System.out.println(title);
	   
	   //5.getCurrentUrl()-It returns URL as an output
	   // String url=driver.getCurrentUrl();
	   //  System.out.println(url);
	     
	     //6.maximize()-It is used to maximize the browser
	   //  driver.manage().window().maximize();
	     
	     //7.navigate-It is altenative method of get()
	   //navigate().to()-It is use for open URL
	    // driver.navigate().to("https://www.facebook.com/");
	     
	     //navigate().forward()-page forward
	     Thread.sleep(2000);
	    // driver.navigate().forward();
	     
	   //  navigate().back()-page back
	   //  Thread.sleep(2000);
	   // driver.navigate().back();
	     
	     //navigate().refresh()-refesh the page
	     //driver.navigate().refresh();
	     
	     //8.setsize-If we set the size of window the we pass the height and width in dimension class.setSize is used ofchange the size of window.
	  // org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(100, 200);
	   //driver.manage().window().setSize(d);

	   
	     //9.getsize()-It is ues for get the size of immediate open browsr
	 //  System.out.println(driver.manage().window().getSize());
	     
	     //10.setPosition()-It is use for change the position of browser.We required x,y co-ordination
	   //  Point p=new Point(200, 200);
	    // driver.manage().window().setPosition(p);
	     
	     //11.getPosition()-It is use  for get the position as an output.
	    // System.out.println(driver.manage().window().getPosition());
	   
	   
	     
	    
	   

	}

}
