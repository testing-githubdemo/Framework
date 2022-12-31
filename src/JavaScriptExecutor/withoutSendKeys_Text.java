package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutSendKeys_Text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("document.getElementById('email').value='abc@gmail.com'");
		   js.executeScript("document.getElementById('pass').value='abc123'");

	}

}
