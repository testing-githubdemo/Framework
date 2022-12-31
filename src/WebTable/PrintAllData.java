package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllData {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement text= driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
			js.executeScript("arguments[0].scrollIntoView()",text);
		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		int col=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//th")).size();
	                     //1<=7
		//2<=7
		for(int i=1;i<=row;i++)
		{//1<=3
			//2<=3
			//3<=3
			//4<=3
			//j=1
			for(int j=1;j<=col;j++)
			{
				if(i==1) {
					//1head data
					//2heding
					//3heading
					String data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(data+ "|");
					
				}
				//2nd row data
				else
				{
					String data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(data+ "|");
				}
		
		
			}
			System.out.println();
		}
		

	}

}
