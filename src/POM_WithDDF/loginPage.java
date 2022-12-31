package POM_WithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebElementMethods.SendKeys;

public class loginPage {
     
	
		
		
	//1.Data member/variavble declare globally with access level privete with @FindBy 
		@FindBy(id="user-name")private WebElement userId;
		@FindBy(xpath ="//input[@id=\"password\"]")private WebElement password;
		@FindBy(name ="login-button")private WebElement btnLogin;
	
		//initize  within a constructor with access level public pusing PagaFactory Class
		public loginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	
		//Utilze within a method with access leve public
	public void userId(String userId1)	
	{
      userId.sendKeys(userId1);
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void btnLogin()
	{
		btnLogin.click();
	}
		 
		 
	   

	
}