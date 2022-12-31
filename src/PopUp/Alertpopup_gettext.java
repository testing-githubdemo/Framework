package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup_gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		   Alert text=driver.switchTo().alert();
		   System.out.println("Text Msg:"+text.getText());
		   text.sendKeys("Welcome");
		   text.accept();
		   

	}

}
