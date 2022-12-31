package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		 //driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		String windowid= driver.getWindowHandle();
		System.out.println("Parent WindowID :"+windowid);
//		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//			 driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
//			Set<String> windowid= driver.getWindowHandles();
//			//System.out.println(" WindowID :"+windowid);
//			Iterator<String> it=windowid.iterator();
//			String parentId= it.next();
//			String childId=it.next();
//			System.out.println("P_ID:"+parentId);
//			Thread.sleep(2000);
//			System.out.println("C_ID:"+childId);
//			Thread.sleep(2000);
//			driver.switchTo().window(parentId);
//			Thread.sleep(2000);
//			driver.switchTo().window(childId);
//			driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
//			driver.findElement(By.xpath("//input[@id=\"Form_submitForm_FullName\"]")).sendKeys("Poonam");
//			driver.findElement(By.xpath("//input[@id=\"Form_submitForm_CompanyName\"]")).sendKeys("L&T");
//			Thread.sleep(2000);
//			driver.switchTo().window(parentId);
//			
//			String parenttitle=driver.getTitle();
//			System.out.println(parenttitle);
//					

	}

}
