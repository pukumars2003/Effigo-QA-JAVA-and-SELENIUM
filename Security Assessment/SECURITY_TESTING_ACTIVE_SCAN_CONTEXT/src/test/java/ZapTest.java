import Util.ZapUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ClientApiException;

import java.lang.reflect.Method;

import static Util.ZapUtil.*;

public class ZapTest {

    WebDriver driver;
    //private final String urlToTest="http://127.0.0.1:8080";
    private final String contextName="testVuln";
    private final String urlToTest="http://testphp.vulnweb.com";

    @BeforeMethod
    public void setUp(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setProxy(proxy);
        chromeOptions.setAcceptInsecureCerts(true);

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(chromeOptions);
    }

    @Test(priority=2)
    public void testPassiveScan(){
        driver.get(urlToTest);
        driver.findElement(By.xpath("//a[normalize-space()='Signup']")).click();
        driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='login']")).click();
        waitTillPassiveScanCompleted();
    }

    @Test(priority=3)
    public void testActiveScan() throws ClientApiException {
        addURLToScanTree(urlToTest);
        performActiveScan(urlToTest, contextName);
    }
    
    @Test(priority=1)
    public void testSpider() throws ClientApiException {
        performSpidering(urlToTest,contextName);
    }


    @AfterMethod
    public void tearDown(Method method) throws ClientApiException {
        generateZapReport(urlToTest,method.getName().replace("test",""));
        cleanTheScanTree();
        driver.quit();
    }

}