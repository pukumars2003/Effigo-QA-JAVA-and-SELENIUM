package Hello;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
public class First {

	public static void Test(WebDriver driver){
		//driver.get("https://youtube.com");
		driver.navigate().to("https://youtube.com");
		
		String a=driver.getTitle();
		System.out.println(a);
		//driver.sendkeys();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		/*for(WebElement a:b) {
			String txt=a.getText();
			System.out.println(txt);}*/
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String s=driver.getWindowHandle();
		System.out.println(s);
		First.Test(driver);
		driver.quit();
	}

}
