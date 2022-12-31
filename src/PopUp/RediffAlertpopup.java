package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAlertpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("abc@gmail.com");
		  //driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123P");
		   driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		  Alert alt= driver.switchTo().alert();
		  System.out.println(alt.getText());
		  String text=alt.getText();
		  if(text.equals("Please enter your password"))
		  {
			  System.out.println("Currect Alert mag");
		  }
		  else
		  {
			  System.out.println("Incurrect Alert msg");
		  }
		  
		  
		   
		   

	}

}
