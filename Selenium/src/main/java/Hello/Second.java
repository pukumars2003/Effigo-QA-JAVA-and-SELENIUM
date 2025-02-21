package Hello;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
public class Second {

	public static void main(String[] args) {
		// Set up the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Step 1: Open the main YouTube page
        driver.get("https://www.youtube.com");

        // Step 2: Get the window handle of the current window
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindowHandle);

        // Step 3: Perform an action that opens a new window (e.g., clicking a link)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstVideo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("ytd-video-renderer a#thumbnail")));
        firstVideo.click();

        // Step 4: Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("All Window Handles: " + allWindowHandles);

        // Step 5: Switch to the new window (we compare window handles to switch)
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the new window
                break;
            }
        }

        // Step 6: Perform actions in the new window (e.g., get the title)
        System.out.println("Title of the new window: " + driver.getTitle());

        // Step 7: Switch back to the main window
        driver.switchTo().window(mainWindowHandle);

        // Step 8: Perform actions in the main window (e.g., get the title)
        System.out.println("Title of the main window: " + driver.getTitle());

        // Step 9: Close the browser
        driver.quit();
	}

}
