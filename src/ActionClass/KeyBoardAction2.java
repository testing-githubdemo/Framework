package ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://the-internet.herokuapp.com/key_presses");
		   driver.manage().window().maximize();
		   Actions act=new Actions(driver);
		   act.sendKeys(Keys.CONTROL).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.SHIFT).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.SPACE).build().perform();
		   Thread.sleep(4000);
		   act.sendKeys(Keys.ESCAPE).build().perform();
	}

}
