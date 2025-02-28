package Friday;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javaexexecutor_zoomin_zoomout {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amrita.edu/event/prakalp/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='50%'");	
		}
}
