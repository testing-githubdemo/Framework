package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUP {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");

		   WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			
			
//			driver.get("https://www.flipkart.com/");
//	        
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//input[@type=\"text\" and @class=\"_2IX_2- VJZDxU\"]")).sendKeys("Poonam@gmail.com");
//	        
//			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Poonam1");
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
			
			System.out.println("------------------------------------------");
//			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		    String Equal="Congratulations! You must have the proper credentials.";
//	  		
//	  		String Text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
//	  		System.out.println(Text);
//	  		System.out.println(Text.equals(Equal));
	  		
      System.out.println("----------------------------------");
//      ChromeOptions option=new ChromeOptions();
//  	option.addArguments("--Disable-notifications");
//  	 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
//
//	   WebDriver driver = new ChromeDriver(option);
//	 driver.manage().window().maximize();
//  	    driver.get("https://www.hdfcbank.com/");
//  	    Thread.sleep(2000);
  	    
  	    System.out.println("--------------------");
  	    
//  	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Poonam@gmail.com");
//	    //driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("P123@");
//	    driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
//	    Thread.sleep(2000);
//	    Alert alert=driver.switchTo().alert();
//	   // System.out.println(alert.getText());
//	    String text=alert.getText();
//	    if(text.equals("Please enter your password"))
//	    {
//	    	System.out.println("currect alert message password");
//	    }
//	    else
//	    {
//	    	System.out.println("In-correct alert message");
//	    }
//	    alert.accept();
//	    driver.quit();
	    System.out.println("------------------");
	    Thread.sleep(5000);   
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();

	}

}
