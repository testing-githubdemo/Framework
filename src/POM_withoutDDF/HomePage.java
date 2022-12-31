package POM_withoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "(//button[@class=\"btn btn_primary btn_small btn_inventory\"])[1]")private WebElement btnAddtoCart;

public void addCart()
	{
	btnAddtoCart.click();
}


}


