package Monday;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Second extends First{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		countItems(driver,mywait);
		Addingtocart(driver,mywait);
		//driver.close();

	}
	
	

}
