package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windoeHandle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://omayo.blogspot.com/");
		   String windowID=driver.getWindowHandle();
	
		  System.out.println("Parent Window Id: "+windowID);

	}

}
