package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3usingmethod {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		takescreenshot1("facebook");
		takescreenshot1("facebook1");
		driver.quit();
	}
	
	public static void takescreenshot1(String Filename) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String Random=RandomString.make(3);
		 // .\\-It represents current project folder directory
		 File dest=new File(".\\"+Filename+""+Random+".png");
		 FileHandler.copy(source, dest);
		 
	}

}
