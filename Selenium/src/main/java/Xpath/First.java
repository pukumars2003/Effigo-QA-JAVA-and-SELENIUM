package Xpath;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
public class First {
	
public static void mM() {
		system.
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement a=driver.findElement(By.xpath("//input[@id='search']"));
	}

}
