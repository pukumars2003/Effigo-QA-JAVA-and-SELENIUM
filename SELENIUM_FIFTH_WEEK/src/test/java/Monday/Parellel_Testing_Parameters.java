package Monday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parellel_Testing_Parameters {
	WebDriver  driver;
	WebDriverWait wait;
	@BeforeClass
	@Parameters({"url"})
	void Setup(String browser) {
		WebDriverManager.chromedriver().setup();
		switch(browser.toLowerCase()){
		case "chrome":	driver=new ChromeDriver(); break;
		case "edge":	driver=new EdgeDriver(); break;
		default: System.out.println("Invalid Browser");return;
		}
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test
	void test_Login() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
	    loginButton.click();
	    String title="Swag Labs";
	    Thread.sleep(4000);
	    
	    
	}
	@AfterClass
	void test_logout() {
		driver.quit();
	}
	
}
