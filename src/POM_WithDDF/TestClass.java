package POM_WithDDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TechMax Data(14-10-22)\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		  //create POM class objet
		   loginPage login=new loginPage(driver);
		   AddToCart add=new AddToCart(driver);
		   
		   
		   FileInputStream file=new FileInputStream("D:\\TechMax Data(14-10-22)\\POM_DDF.xlsx");
		   Sheet data=WorkbookFactory.create(file).getSheet("Sheet1");
		   String usernm= data.getRow(0).getCell(0).getStringCellValue();
		   login.userId(usernm);
		   
		   String password=data.getRow(0).getCell(1).getStringCellValue();
		   login.password(password);
		   login.btnLogin();
		   
		   add.addCart();
		   driver.quit();
		 
	}

}
