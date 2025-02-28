package Friday;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New_Window_Tab {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println(driver.getCurrentUrl());
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://example.com");
		System.out.println(driver.getCurrentUrl());
	}
}
