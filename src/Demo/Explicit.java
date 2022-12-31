package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver =new ChromeDriver();
		
driver.manage().window().maximize();

driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("Chesse" + Keys.ENTER);

WebElement value=new WebDriverWait(driver, Duration.ofSeconds(15))
    		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
		    value.click();
		    System.out.println(value.getText());
}

}

