package Monday;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Multiple_Window_With_Loop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
		driver.manage().window().maximize();
		WebDriverWait mwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		WebElement press_one=driver.findElement(By.xpath("//a[.='Practice API Testing using Magento 2']"));
		press_one.click();
		
		Set<String> widows=driver.getWindowHandles();
		System.out.println(widows);
		
		
		List<String> id=new ArrayList(widows);
		

		
		for(String e:id) {
			String current=driver.switchTo().window(e).getTitle();
			
			System.out.println(current);
			
			if(current.equals("Tees - Tops - Men")) {
				System.out.println("Success");
				
			}
			else {
				System.out.println("No");
			}
		}
		
	}

}
