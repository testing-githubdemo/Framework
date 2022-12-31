package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddendivisionPopUp1 {
	//HiddenDivision_Popup

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.flipkart.com/");
		  // driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("abc@gmail.com");
		   //Thread.sleep(2000);
		 // driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("23456");
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		  //driver.findElement(By.xpath("//div[@class=\"IiD88i _351hSN\"]//input")).sendKeys("9087656786");
		  //driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();

	}

}
