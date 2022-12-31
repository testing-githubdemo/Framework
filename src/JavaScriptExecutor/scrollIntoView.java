package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		  WebElement scroll= driver.findElement(By.xpath("//span[@class=\"navFooterBackToTopText\"]"));
		  js.executeScript("arguments[0].scrollIntoView();", scroll);
		   

	}

}
