package FF;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Script {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Java_Test\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/inputs");
		String text=driver.getTitle();
		
		System.out.println(text);
		driver.manage().window().maximize();
		driver.findElement(By.name("input-number")).sendKeys("3");
		//Boolean b=driver.findElement(By.id("").isDisplayed());
		
		//PartialLink and Link Text
		driver.findElement(By.linkText("API Testing")).click();
		
		driver.quit();
	}

}
