package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   //webElement-It is represent HTML element in DOM structure,generally all operations on web page will  be perfrom through webElement
		   driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("Rohit@gmail.com");
		 
		 //sendKey-This method is ude to enter value in the input field.
		 

	}

}
