package Monday;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;


public class First {

	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		countItems(driver,mywait);
		Addingtocart(driver,mywait);
		//driver.close();
	}
	
	public static void countItems(WebDriver driver,WebDriverWait mwait) {
		List<WebElement> a=driver.findElements(By.xpath("//li[@class=\"item product product-item\"]"));
		System.out.println(a.size());
		int size=a.size();
		
            WebElement dropdownElement = driver.findElement(By.xpath("//select[@id=\"limiter\"]"));  
            Select selectDropdown = new Select(dropdownElement);  
            WebElement selectedOption = selectDropdown.getFirstSelectedOption();  
            Integer selectedValue = Integer.parseInt(selectedOption.getAttribute("value")); 
            System.out.println("Selected option value: " + selectedValue);  
            
            if(size==selectedValue) {System.out.println("Count and Page is matching");}
            else {System.out.println("Not matching");}
        }
	
	public static void Addingtocart(WebDriver driver,WebDriverWait mywait) {
		WebElement add=driver.findElement(By.xpath("//img[@alt=\"Strike Endurance Tee\"]"));
		add.click();
		mywait.until(ExpectedConditions.titleContains("Strike Endurance Tee"));
		
		WebElement cart_buuton=driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]"));
		//System.out.println(cart_buuton.isEnabled());
		
		if(cart_buuton.isEnabled()) {
			
			WebElement size=driver.findElement(By.xpath("//div[@option-label=\"XS\"]"));
			size.click();
			WebElement color=driver.findElement(By.xpath("//div[@option-label=\"Blue\"]"));
			color.click();
			
			WebElement a=driver.findElement(By.xpath("//img[@class=\"fotorama__img\"]"));
			 
			String actualImageUrl = a.getAttribute("src"); 
			System.out.println(actualImageUrl);
			String colorUrl="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/m/s/ms08-blue_main_1.jpg";
			
			cart_buuton.click();
			
			mywait.until(ExpectedConditions.alertIsPresent( ));
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role=\"alert\"]")));
			String msg=driver.findElement(By.xpath("//div[@role=\"alert\"]")).getText();
			
			if(msg.contains("You added Strike Endurance Tee to your")) {
				System.out.println("Success");
			}
			
		
		}
		
		
		
	}
	

}
