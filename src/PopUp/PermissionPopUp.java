package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//permission popup-
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver(options);
		   driver.get("https://www.hdfcbank.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   

	}

}
