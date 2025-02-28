package Friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.text-compare.com");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		a.sendKeys("Hello");
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp (Keys.CONTROL).perform();
		
		//Ctrl+Shift+a
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("C").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).perform();
	}
	

}
