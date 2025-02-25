package Tuesday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert(driver,mywait);
		Thread.sleep(5000);
		ConfirmationAlert(driver,mywait);
		Thread.sleep(3000);
		InputAlert(driver,mywait) ;
	}
	
	public static void Alert(WebDriver driver,WebDriverWait mywait) {
		mywait.until(ExpectedConditions.titleContains("The Internet"));
		WebElement a=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
		a.click();
		//Normal Alert
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
	}
	
	public static void ConfirmationAlert(WebDriver driver,WebDriverWait mywait) {
		
		WebElement a=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
		a.click();
		//Normal Alert
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
		
	}
	
public static void InputAlert(WebDriver driver,WebDriverWait mywait) {
		
		WebElement a=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
		a.click();
		//Normal Alert
		Alert al=driver.switchTo().alert();
		String s="Hello";
		al.sendKeys(s);
		al.accept();
		String res=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(res);
		String re=res.replace("You entered: ", "");
		if(s.equals(re)) {
			System.out.println("Equal");
		}
		//al.dismiss();
		
	}

}
