package Tuesday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrap_DropDown {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		checkBox(driver,mywait);

	}
	
	public static void checkBox(WebDriver driver,WebDriverWait mywait) {
		//mywait.until(ExpectedConditions.titleContains("A demo (test) with option groups"));
		
		
		WebElement a=driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));
		a.click();
		WebElement c=driver.findElement(By.xpath("//input[@value=\"Java\"]"));
		c.click();
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"btn-group open\"]//ul//li")));
		List<WebElement> b=driver.findElements(By.xpath("//div[@class=\"btn-group open\"]//ul//li"));
		
		System.out.println(b.size());
		for(WebElement e:b) {
			System.out.println(e.getText());
		}
		
	}
}
