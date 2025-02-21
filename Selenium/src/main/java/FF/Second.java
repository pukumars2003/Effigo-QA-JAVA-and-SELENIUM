package FF;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Second {

	public static void main(String[] args) {
		// Automatically setup ChromeDriver
        //WebDriverManager.chromedriver().setup();

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Your test code here
        driver.get("https://www.example.com");
        String text=driver.getTitle();
		
		System.out.println(text);
        // Close the browser
        driver.quit();

	}

}
