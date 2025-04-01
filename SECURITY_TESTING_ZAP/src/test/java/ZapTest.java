import Util.ZapUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static Util.ZapUtil.*;

public class ZapTest {

    WebDriver driver;
    private final String urlToTest="http://127.0.0.1:8080/WebGoat/login";
   // private final String urlToTest="https://ginandjuice.shop/";

    @BeforeMethod
    public void setUp(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setProxy(proxy);
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(chromeOptions);
    }

    @Test
    public void testPassiveScan(){
        driver.get(urlToTest);
        driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("ajay123");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("ajay123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        waitTillPassiveScanCompleted();
    }

    @AfterMethod
    public void tearDown(Method method){
        generateZapReport(urlToTest);
        driver.quit();
    }

}