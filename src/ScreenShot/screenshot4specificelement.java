package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot4specificelement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		File source=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
		 String Random=RandomString.make(2);
		 String Filename="logo";
		 File dest=new File(".\\"+Filename+""+Random+".png");
		 FileHandler.copy(source, dest);
		 driver.quit();
	}

}
