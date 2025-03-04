package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement fname;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement lname;
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	@FindBy(xpath="//input[@id='input-password']") WebElement password;
	@FindBy(xpath="//input[@name='agree']") WebElement agree;
	@FindBy(xpath="//button[normalize-space()='Continue']") WebElement submit;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement msg;
	
	
	public void enterFname(String name) {
		fname.sendKeys(name);
	}
	public void enterLname(String name){
		lname.sendKeys(name);
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	public void enterPassword(String pwd) {
		password .sendKeys(pwd);
	}
	
	public void agreeBtn() {
		agree.click();
	}
	public void SubmitBtn() {
		submit.click();
	}
	
	public String getConfiramtionMsg() {
		try {
			return(msg.getText());
		}catch(Exception e) {
			return (e.getMessage());
		}
	}
	
}
