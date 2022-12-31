package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getext_Method {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   //3.getText()-return type String
		   //This method is use to return text present in webpage.
		   String ExpectedResult="Facebook helps you connect and share with the people in your life.";
		   String text=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
		   System.out.println(text);
		   
		   System.out.println(text.equals(ExpectedResult));
	}

}
