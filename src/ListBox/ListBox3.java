package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {
   
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		  WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		  WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		  WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		  Thread.sleep(2000);
		  
		   //1.selectByValue
		// Select s=new Select(day);
		   //Thread.sleep(2000);
		
//		 s.selectByValue("10");
//		 Select s2=new Select(month);
//		 s2.selectByValue("7");
//		 Select s3=new Select(year);
//		 s3.selectByValue("1997");
		 
		   //selectByVisibleText
//		  Select s1=new Select(day);
//		  s1.selectByVisibleText("23");
//		  Select s2=new Select(month);
//		  s2.selectByVisibleText("Jul");
//		  Select s3=new Select(year);
//		  s3.selectByVisibleText("2010");
		  
		  //selectByIndex
		  
		  Select s1=new Select(day);
		  s1.selectByIndex(5);
		  Select s2=new Select(month);
		  s2.selectByIndex(7);
		  Select s3=new Select(year);
		  s3.selectByIndex(1);
		  
		  
		   
	}

}
