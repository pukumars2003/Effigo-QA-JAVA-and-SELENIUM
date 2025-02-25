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

public class Select_Option {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		checkBox(driver,mywait);

	}
	
	public static void checkBox(WebDriver driver,WebDriverWait mywait) {
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"control-group\"]//input[@name=\"tool\"]")));
		
		WebElement b=driver.findElement(By.xpath("//select[@id=\"continents\"]"));
		Select a=new Select(b);	
		a.selectByVisibleText("Asia");
		//a.selectByValue("Asia");
		//a.selectByIndex(1);
		//a.getFirstSelectedOption();
		
		// Getting size of the Dropdown
		List<WebElement> c=a.getOptions();
		System.out.println(c.size());
		
		for(WebElement e:c) {
			System.out.println(e.getText());
		}
		
	}
}
