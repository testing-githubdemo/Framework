package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2porjectfile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File destination=new File("C:\\Users\\Datta Patil\\eclipse-workspace\\Selenium_TechMax\\Screenshot\\abc1.png"); 
	  org.openqa.selenium.io.FileHandler.copy(source, destination);
		
		

	}

}
