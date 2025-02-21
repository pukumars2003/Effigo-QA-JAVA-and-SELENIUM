package Hello;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Third {
	public static void Test(WebDriver driver){
		//driver.get("https://youtube.com");
		
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String s=driver.getWindowHandle();
        driver.navigate().to("https://www.automationexercise.com/");
        WebElement a=driver.findElement(By.tagName("a"));
        
        System.out.println("Single or First ELement "+a);
		//List<WebElement> b=driver.findElements(By.className("col-sm-4"));
        List<WebElement> b=driver.findElements(By.tagName("a"));
		System.out.println(b.size());
		System.out.println(b);
		driver.quit();

	}

}
