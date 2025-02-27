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

public class Table_Static {
	
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
		checkBox(driver,mywait);

	}
	
	public static void checkBox(WebDriver driver,WebDriverWait mywait) {
		mywait.until(ExpectedConditions.titleContains("Automation Practice"));
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@id=\"countries\"]//tbody//tr")));
		List<WebElement> b=driver.findElements(By.xpath("//table[@id=\"countries\"]//tbody//tr"));
		WebElement c=driver.findElement(By.xpath("//table[@id=\"countries\"]//tbody//tr[190]//td[1]"));
		System.out.println(c.getText());
		System.out.println(b.size());
		/*for(WebElement e:b) {
			System.out.println(e.getText());
		}
		**/
	}

}
