package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acitoncls {
	

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		Actions act =new Actions(driver);
		
		WebElement Admin =driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item active\"]"));
		WebElement UserManage=driver.findElement(By.xpath("//span[contains(text(),'User Management ')]"));
		//WebElement User =driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]"));
		
		
		// Mouseover to admin tab
		act.moveToElement(Admin).build().perform();
		
		Thread.sleep(3000);
		//Mouseover to Usermanage
		act.moveToElement(UserManage).build().perform();
		Thread.sleep(3000);
		
		//act.moveToElement(User).build().perform();
		//Thread.sleep(3000);

// Instead of writing three statement we can write on statement		
		
		
//act.moveToElement(Admin).moveToElement(UserManage).moveToElement(User).build().perform();

UserManage.click();

	}

}
