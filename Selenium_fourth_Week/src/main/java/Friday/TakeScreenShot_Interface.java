package Friday;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot_Interface {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Nice-jQuery-Range-Input-Replacement-Plugin-Ranger/");
		
		driver.manage().window().maximize();
		
	
		//Full Page ScreenShot
		TakesScreenshot ts=(TakesScreenshot) driver;
		/*File sorce=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShotFolders\\full.png");
		sorce.renameTo(targetfile);**/
		
		
		
		//Capture the ScreenShot Specific Sections
		WebElement a=driver.findElement(By.xpath("//fieldset[2]"));
		//a.getScreenshotAs(OutputType.FILE);
		File sorce=a.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShotFolders\\box.png");
		sorce.renameTo(targetfile);
	}

}
