package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Loacators
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement acountbtn;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement registerbtn;
	

	public void accountBtn() {
		acountbtn.click();
	}
	public void clickRegister() {
		registerbtn.click();
	}
	
	
}
