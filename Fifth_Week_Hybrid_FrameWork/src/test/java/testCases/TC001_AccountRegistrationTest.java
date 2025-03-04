package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

import java.time.Duration;


import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC001_AccountRegistrationTest {
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("http://localhost/opencart/upload/");
		 driver.manage().window().maximize();
	}
	
	@AfterClass
	public void EndofCode() {
		driver.quit();
	}
	
	@Test
	public void verify_account_reg() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.accountBtn();
		hp.clickRegister();
		
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		arp.enterFname("Ajay");
		arp.enterLname("K");
		arp.enterEmail("admi@gmail.com");
		arp.enterPassword("Ok1234@");
		Thread.sleep(3000);
		arp.agreeBtn();
		arp.SubmitBtn();
		String confirmMsg=arp.getConfiramtionMsg();
		
		Assert.assertEquals(confirmMsg, "Your Account Has Been Created!");
		
	}
	
}
