package Tuesday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;


public class Check_Box_And_Form {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		checkBox(driver,mywait);

	}
	
	public static void checkBox(WebDriver driver,WebDriverWait mywait) {
		mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"control-group\"]//input[@name=\"tool\"]")));
		List<WebElement> hobbies=driver.findElements(By.xpath("//div[@class=\"control-group\"]//input[@name=\"tool\"]"));
		System.out.println(hobbies.size());
		//WebElement hobbie=driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//label[@title]"));
		//hobbie.click();
		System.out.println(hobbies.size());
		
		/*for(WebElement check:hobbies) {
			check.click();
		}*/
		// for checkbox to checkbox last 2 index
		for(int i=1;i<hobbies.size();i++) 
		{
			hobbies.get(i).click();
			
		}
		
		// for checkbox to checkbox first 2 index
		for(int i=0;i<hobbies.size();i++) 
		{
			hobbies.get(i).click();
					
		}
		
		
		// for checkbox to checkbox first 2 index
		for(int i=0;i<1;i++) 
		{
			if(hobbies.get(i).isSelected()) {
			hobbies.get(i).click();
			}
							
		}
		
	}

}
