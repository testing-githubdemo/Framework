package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		WebElement Text =driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", Text);
//		
//		
//		// How many rows are there in table
//		
//		// First way
//	int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//		
//	System.out.println(row);
//	
//	// Second Way
//	
//	List<WebElement>Row1 =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
//	System.out.println(Row1.size());
//	
//	// How many col in the table
//	
//	int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
//	
//	System.out.println(col);
		
		Thread.sleep(2000);
		//to open created webtable page
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		int rowSize = 
		driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		//identify table
		for (int i = 1; i <= rowSize; i++) 
		{
		int colSize1;
		if (i==1)
		{
		colSize1 =driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/th")).size();
		}
		else
		{
		colSize1 = 
		driver.findElements(By.xpath("//table[@id='customers']//tr["+i+"]/td")).size();
		}
		for (int j = 1; j <= colSize1; j++) 
		{
		if (i==1) 
		{
		WebElement Alldata = 
		driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//th["+j+"]"));
		String text = Alldata.getText();
		System.out.print(text+" ");
		} 
		else
		{
		WebElement Alldata = 
		driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
		String text = Alldata.getText();
		System.out.print(text+" ");
		}
		}
		System.out.println();
		}
		
	}

}
