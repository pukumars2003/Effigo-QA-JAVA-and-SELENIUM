package Hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FOur {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				String s=driver.getWindowHandle();
		        driver.navigate().to("https://www.automationexercise.com/");
		        Boolean a=driver.findElement(By.cssSelector("#accordian")).isDisplayed();
				System.out.println(a);
				driver.quit();

	}

}
