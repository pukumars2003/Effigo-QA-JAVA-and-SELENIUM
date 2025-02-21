package CSS_SELECTOR;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sauce_demo_One {
	//static Double total=0.0;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		login(driver,wait);
		itemsPrint(driver,wait);
		Double to=TotalReturn(driver,wait);
		System.out.println(to);
		itemsToCart(driver,wait);
		itemsInCart(driver,wait);
		FillDetails(driver,wait,to);
	    driver.quit();

	}
	public static double TotalReturn(WebDriver driver,WebDriverWait wait) {
		double total = 0;
		List<WebElement> itemsList=driver.findElements(By.cssSelector("div.inventory_item"));
	    for(WebElement a:itemsList) {
	    	WebElement name=a.findElement(By.cssSelector("div.inventory_item_name"));
	    	WebElement price=a.findElement(By.cssSelector("div.inventory_item_price"));
	    	//System.out.println("Ok");
	    	String s=price.getText();
	    	//System.out.println(s);
	    	String money=s.replace("$", "");
	    	//System.out.println("After "+money);
	    	total+=Double.parseDouble(money);
	    	System.out.println(total);
	    }
	    return total;
	    
	}
	
	public static void login(WebDriver driver,WebDriverWait wait) {
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
	    loginButton.click();
	    
	    wait.until(ExpectedConditions.urlContains("/inventory.html"));
	    System.out.println("Page title is: " + driver.getTitle());
	}
	
	public static void itemsPrint(WebDriver driver,WebDriverWait wait) {
		List<WebElement> itemsList=driver.findElements(By.cssSelector("div.inventory_item"));
	    System.out.println(itemsList.size());
	    for(WebElement a:itemsList) {
	    	WebElement name=a.findElement(By.cssSelector("div.inventory_item_name"));
	    	WebElement price=a.findElement(By.cssSelector("div.inventory_item_price"));
	    	System.out.println(name.getText()+"-->"+price.getText());
	    }
	}
	
	public static void itemsToCart(WebDriver driver,WebDriverWait wait) {
		List<WebElement> itemsList=driver.findElements(By.cssSelector("div.inventory_item"));
	    //System.out.println(itemsList.size());
	    for(WebElement a:itemsList) {
	    	WebElement Add_to_cart=a.findElement(By.xpath("//button[.='Add to cart']"));
	    	Add_to_cart.click();
	    }
	}
	
	public static void itemsInCart(WebDriver driver,WebDriverWait wait) {
		WebElement Cart=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
	    Cart.click();
	    wait.until(ExpectedConditions.urlContains("/cart.html"));
	    WebElement CheckOut=driver.findElement(By.id("checkout")); 
	    CheckOut.click();
	    String url=driver.getCurrentUrl(); 
	    System.out.println(url);
	}
	
	public static void FillDetails(WebDriver driver,WebDriverWait wait,double to) {
		WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
	    firstname.sendKeys("AEIOU");
	    WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
	    lastname.sendKeys("U");
	    
	    WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
	    zipcode.sendKeys("582145");
	    WebElement checkout=driver.findElement(By.xpath("//input[@type='submit']"));
	    checkout.click();
	    
	    
	    wait.until(ExpectedConditions.urlContains("/checkout-step-two.html"));
	    String url=driver.getCurrentUrl(); 
	    System.out.println(url);
	    String subtoatal=driver.findElement(By.xpath("//div[@data-test='subtotal-label']")).getText();
	    String su=subtoatal.replace("Item total: $","");
	    System.out.println(su);
	    if(to ==Double.parseDouble(su)) {
	    	System.out.println("Success");
	    }
	    else {
	    	System.out.println("failure");
	    }
	}

}
