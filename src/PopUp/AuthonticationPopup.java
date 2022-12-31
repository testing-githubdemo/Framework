package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthonticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		   String equal="Congratulations! You must have the proper credentials.";
		  String text= driver.findElement(By.xpath("//div[@class=\"example\"]//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
		   System.out.println(equal.equals(text));
		   
		   
		   

	}

}
