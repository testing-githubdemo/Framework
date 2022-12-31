package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox7 {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		   Thread.sleep(2000);
		   WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		   Select s1=new Select(month);
		   
		   //grtOptions()-It will return all the options into a listbox
		   List<WebElement>Alloptions =s1.getOptions();
		   System.out.println(Alloptions.size());
		   
		   //Q.how to print all values in listbox?
//		   for(WebElement str:Alloptions)
//		   {
//			   String text=str.getText();
//			   System.out.println(text);
//		   }
		   
		   for(int i=0;i<Alloptions.size();i++)
		   {
			   String monthvalue=Alloptions.get(i).getText();
			   System.out.println(monthvalue);
			   
			   //Q.How will you select specific value in listbox?
//			   if(monthvalue.equals("Feb"))
//			   {
//				   Alloptions.get(i).click();
//				   break;
//			   }
		   }
		 
		   
		  
		   
		   
	}

}
