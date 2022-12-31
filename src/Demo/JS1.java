package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JS1 {
//static 	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		Thread.sleep(3000);
//		
//	  WebElement Click=driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
//	  
//	  
//	  JS1.clickelement(Click, driver);
//
//}
//
//public static void clickelement(WebElement element, WebDriver driver) {
//	
//	JavascriptExecutor js = ((JavascriptExecutor)driver);
//	
//	js.executeScript("arguments[0].click()", element);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//WebElement data=driver.findElement(By.xpath("//span[@class=\"navFooterBackToTopText\"]"));
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
			Thread.sleep(3000);
		//	js.executeScript("document.documentElement.scrollTop=0", args);
}

}
