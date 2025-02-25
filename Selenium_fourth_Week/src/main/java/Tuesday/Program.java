package Tuesday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		ExtractingDynamicLinks(driver,mywait);
		
	}
	
	public static void ExtractingDynamicLinks(WebDriver driver,WebDriverWait mywait) {
		mywait.until(ExpectedConditions.titleContains("Automation Testing Practice"));
		WebElement b=driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		b.sendKeys("Hello");
		WebElement c=driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\" and @type=\"submit\"]"));
		c.click();
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//div//a")));
		List<WebElement> a=driver.findElements(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]//div//a"));
		System.out.println(a.size());
		for(WebElement e:a) {
			System.out.println(e.getText());
		}
		
	}
	
	

}
