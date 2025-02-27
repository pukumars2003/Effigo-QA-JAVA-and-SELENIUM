package Thursday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
public class Dynamic_Table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		/*WebElement a=driver.findElement(By.xpath("//input[@id='input-username']"));
		a.sendKeys("demo");
		WebElement b=driver.findElement(By.xpath("//input[@id='input-password']"));
		b.sendKeys("demo");*/
		WebElement d=driver.findElement(By.xpath("//button[@type='submit']"));
		d.click();
		wait.until(ExpectedConditions.titleContains("Dashboard"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Sales']")));
		WebElement c=driver.findElement(By.xpath("//a[normalize-space()='Sales']"));
		c.click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='active']//a[contains(text(),'Returns')]")));
		WebElement e=driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'Returns')]"));
		e.click();
		System.out.println(driver.getTitle());
		
	}
	
	public static void Dynamic(WebDriver driver,WebDriverWait wait) {
		WebElement f=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']"));
		String g=f.getText();
		int h=Integer.parseInt(g.substring(g.indexOf("(")+1,g.indexOf("Pages")-1));
		for(int i=1;i<=5;i++) {
			if(i>1) {
				WebElement k=driver.findElement(By.xpath("//ul[@class=\"pagination\"]//*[text()="+i+"]"));
				k.click();
			}
			
		}
	}

}
