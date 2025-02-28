package Friday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Nice-jQuery-Range-Input-Replacement-Plugin-Ranger/");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement a = driver.findElement(By.xpath("//fieldset[1]//div[1]//div[1]//span[1]//span[1]"));
		System.out.println(a.getLocation());
		act.dragAndDropBy(a, -5, 425).perform();
		System.out.println("After Moving :"+a.getLocation());
		WebElement b = driver.findElement(By.xpath("//fieldset[1]//div[2]//div[1]//span[1]//span[1]"));
		System.out.println(b.getLocation());
		act.dragAndDropBy(b, 5, 425).build().perform();
		System.out.println("After Moving :"+b.getLocation());
		
		
	}
	

}
