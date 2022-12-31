package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement text= driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		js.executeScript("arguments[0].scrollIntoView()",text);
		//how many rows in table
//		int size=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();
//		System.out.println("No of rows:"+size);
		//2.way
	List<WebElement>rowsize =driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr"));
	System.out.println("No of Rows: "+rowsize.size());
	//Print all column in 1st row
	List<WebElement> AllCol=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//th"));
	for(WebElement column:AllCol)
	{
		System.out.println(column.getText());
	}
		
		//how many col present in table
//		int colsize=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th")).size();
//		System.out.println("No of columns:"+colsize);
	//2.way
	List<WebElement> colsize=driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr//th"));
	System.out.println("No of col: "+colsize.size());
	
     //print all rows in 1st b column
WebElement colHeding=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr//th[1]"));
System.out.println(colHeding.getText());
    List<WebElement>AllRowData=driver.findElements(By.xpath("//table[@id=\"customers\"]//td[1]"));
    for(WebElement allrow:AllRowData)
    {
    	System.out.println(allrow.getText());
    }


////	Specific data print into a table
//String data=driver.findElement(By.xpath("//table[@id=\"customers\"]//tbody//tr[2]//td[1]")).getText();
//System.out.println(data);
		
		

	}

}
