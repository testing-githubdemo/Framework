package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 //driver.switchTo().frame("singleframe");
		 driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		 WebElement outerframe=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		 driver.switchTo().frame(outerframe);
		 WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		 driver.switchTo().frame(innerframe);
		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hiii");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();

	}

}
