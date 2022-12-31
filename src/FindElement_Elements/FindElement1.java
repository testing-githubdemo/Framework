package FindElement_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   
		 //  driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("onepluse");
//		WebElement links=driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
//		   System.out.println(links.getText());
		   
		   WebElement links=driver.findElement(By.xpath("//a[@class=\"nav-  \"]"));
		   System.out.println(links.getText());

	}

}
