package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		 System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		   Thread.sleep(2000);
		   FileInputStream file=new FileInputStream("D:\\TechMax Data(14-10-22)\\DDF.xlsx");
		   Sheet data=WorkbookFactory.create(file).getSheet("Sheet1");
		   driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		   driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(data.getRow(0).getCell(1).getStringCellValue());
		   driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		   

	}

}
