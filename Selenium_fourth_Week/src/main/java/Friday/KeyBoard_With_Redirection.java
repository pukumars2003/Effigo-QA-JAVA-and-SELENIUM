package Friday;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_With_Redirection {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//a[text()='Register']"));
		
		act.keyDown(Keys.CONTROL).click(a).keyUp(Keys.CONTROL).perform();
		
		List<String> ids=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		System.out.println(driver.getCurrentUrl());
	}
}
