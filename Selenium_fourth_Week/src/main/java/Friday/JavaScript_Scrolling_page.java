package Friday;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Scrolling_page {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amrita.edu/event/prakalp/");
		//WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,3000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;", ""));
		
				
		//scroll the page till element is visible
		//WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='organizing committee']"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//scroll page till end of the page
		//WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='organizing committee']"));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}
}
