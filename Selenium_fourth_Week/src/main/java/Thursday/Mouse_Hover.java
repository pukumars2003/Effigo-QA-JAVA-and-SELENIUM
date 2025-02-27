package Thursday;

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

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		countItems(driver,mywait);
		
	}
	
	public static void countItems(WebDriver driver,WebDriverWait mwait) throws InterruptedException {
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.xpath("//a[@id=\"ui-id-5\"]//span[@class=\"ui-menu-icon ui-icon ui-icon-carat-1-e\"]"));
		WebElement tops=driver.findElement(By.xpath("//a[@id='ui-id-17']"));
		Actions act=new Actions(driver);
		act.moveToElement(dropdown).moveToElement(tops).perform();
		
		
		//Right Click Action
		//act.contextClick(tops).perform();
		
		//double Click Action
		//act.doubleClick(tops).perform();
		
	}
	
}
