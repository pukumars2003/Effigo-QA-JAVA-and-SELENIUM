package Thursday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Drag(driver,mywait);
		
	}
	
	public static void Drag(WebDriver driver,WebDriverWait mwait) throws InterruptedException {
		Thread.sleep(5000);
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"droparea\"]"));
		WebElement drag=driver.findElement(By.xpath("//div[@id=\"dragarea\"]//img[@id=\"angular\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		
		//Right Click Action
		//act.contextClick(tops).perform();
		
		//double Click Action
		//act.doubleClick(tops).perform();
		
	}

}
