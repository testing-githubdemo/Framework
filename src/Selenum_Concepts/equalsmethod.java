package Selenum_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class equalsmethod {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   
		   //WebDriver methods-
		  // 1.get()-It is ues to open application or enter URL in a WebDriver
		   driver.get("https://www.facebook.com/");
		    String title=driver.getTitle();
		    System.out.println(title);
		    String Expectedtitle="Facebook – log in or sign up";
		    if(title.equals(Expectedtitle))
		    {
		    	System.out.println("Currect title");
		    }
		    else
		    {
		    	System.out.println("Incurrect title");
		    }
		    

	}

}
