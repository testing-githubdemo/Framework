package POM_withoutDDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//private WebElement userId = driver.findElement(By.id("user-name"));
	@FindBy(id="user-name")private WebElement userId;
	@FindBy(xpath ="//input[@id=\"password\"]")private WebElement password;
	@FindBy(name = "login-button")private WebElement btnLogin;
	
	public void userId()
	{
		userId.sendKeys("standard_user");
	}
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	public void login()
	{
		btnLogin.click();	
	}
	
	

}
