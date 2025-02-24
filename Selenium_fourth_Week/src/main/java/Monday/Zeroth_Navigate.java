package Monday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

public class Zeroth_Navigate {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().to("https://google.com");
		
		URL myurl=new URL("https://google.com");
		
		driver.navigate().to(myurl);
		
		driver.navigate().to("https://youtube.com");
		System.out.println("The Current Url Before back method(): "+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("The Current Url After back method(): "+driver.getCurrentUrl());
		
		
		driver.navigate().forward();
		System.out.println("The Current Url Forward method(): "+driver.getCurrentUrl());
		
		
		driver.navigate().refresh();
	}

}
