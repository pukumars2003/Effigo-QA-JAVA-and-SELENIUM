package Thursday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Handler {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		//Thread.sleep(5000);
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframeElement);
		
		WebElement d=driver.findElement(By.xpath("//input[@id='datespicker']"));
		d.sendKeys("04/12/2025");
		WebElement z=driver.findElement(By.xpath("//input[@id='datespicker']"));
		z.click();
		Thread.sleep(5000);
		String Year="2030";
		String Month="October";
		String date="30";
		
		DatePick(driver,wait,Year,Month,date);
		
	}
	
	public static void DatePick(WebDriver driver,WebDriverWait wait,String Year,String Month, String date) {
		//div[@class="ui-datepicker-title"]//span[@class="ui-datepicker-month"] ui-datepicker-year
		
		
		String Currentyear=driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]//span[@class=\"ui-datepicker-year\"]")).getText();
		String CurrentMonth=driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]//span[@class=\"ui-datepicker-month\"]")).getText();
		
		while (true){
			if (Currentyear.equals(Year) && CurrentMonth.equals(Month)){
				break;
			}
			
			WebElement next=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
			next.click();
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//a"));
		for(WebElement e:dates) {
			if(e.getText().equals(date)){
				e.click();
				break;
			}
		}
		
	}

}
