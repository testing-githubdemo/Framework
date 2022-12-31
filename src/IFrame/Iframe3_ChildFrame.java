package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3_ChildFrame {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.automationtesting.in/Frames.html");
		   driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		  WebElement outerframe= driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		   driver.switchTo().frame(outerframe);
		  WebElement innerframe= driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		  driver.switchTo().frame(innerframe);
		  driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		  //When frame  with in frame then we switch frome child frame to immidiate child frame then we use perentFrame()
		  driver.switchTo().parentFrame();
		String text=  driver.findElement(By.xpath("//div[@class=\"iframe-container\"]//h5[contains(text(),'Nested iFrames')]")).getText();
		  System.out.println(text);
		  //When you are in frame the we switch to mainpage by using defauleContect()
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

	}

}
