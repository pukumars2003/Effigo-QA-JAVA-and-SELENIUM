package Monday;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
public class First {
	ChromeOptions opt;
	WebDriver  driver;
	WebDriverWait wait;
	@BeforeClass
	void Setup() {
		WebDriverManager.chromedriver().setup();
		opt=new ChromeOptions();
		opt.addArguments("--headless");
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="db")
	void test_Login(String usr,String pwd) throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys(usr);
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(pwd);
		WebElement loginButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
	    loginButton.click();
	    String title="Swag Labs";
	    Thread.sleep(4000);
	    if(title.equals(driver.getTitle())) {
	    	WebElement lo = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		    lo.click();
		    driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		    
		  //a[@id='logout_sidebar_link']
	    	Assert.assertTrue(true);
	    }
	    else {
	    	Assert.fail();
	    }
	}
	
	/*@AfterClass
	void test_logout() {
		
	}*/
	
	@DataProvider(name="db",indices= {0,2,4})
	Object[][] usernames(){
		 Object[][] data= {
				 {"standard_user","secret_sauce"},
				 {"locked_out_user","secret_sauce"},
				 {"problem_user","secret_sauce"},
				 {"performance_glitch_user","secret_sauce"},
				 {"standard_user","secretsauce"}
				 };
		
		return data;
	}
	
}
