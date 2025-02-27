package Thursday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zeorth {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		checkBox(driver,mywait);

	}
	
	public static void checkBox(WebDriver driver,WebDriverWait mywait) throws InterruptedException {
		mywait.until(ExpectedConditions.titleContains("Google"));
		
		
		WebElement a=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
		a.click();
		//WebElement c=driver.findElement(By.xpath(""));
		Thread.sleep(10000);
		//mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"presentation\"]//span")));
		List<WebElement> b=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"presentation\"]//span"));
		
		System.out.println(b.size());
		for(WebElement e:b) {
			System.out.println(e.getText());
		}
		
	}

}
