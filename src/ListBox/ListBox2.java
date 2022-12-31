package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Radha");
		driver.findElement(By.name("lastname")).sendKeys("More");
		driver.findElement(By.name("reg_email__")).sendKeys("9867546756");
		driver.findElement(By.name("reg_passwd__")).sendKeys("P@123ab");
		
		//Handle ListBox
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'22') and  @value='22']")).click();
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Jul')]")).click();
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1995')]")).click();
		
		//Handle radio button
		
		//driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected();
		//		   if( driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected()==false)
		//		   {
		//			   driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).click();
		//		   }
		//		   else
		//		   {
		//			   driver.findElement(By.xpath("//input[@class=\"_8esa\"]")).isSelected();
		//		   }

		driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected();
		if (driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected()==false)
		{
			driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).click();
		}
		else {
			driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[2]")).isSelected();
		}


		driver.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click();



	}

}
