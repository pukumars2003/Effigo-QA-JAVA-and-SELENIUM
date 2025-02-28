package Friday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single_File_Upload {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		
		 driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Admin\\Desktop\\Effigo Daily Reports\\Fourth Week\\New Text Document.txt");
		 Thread.sleep(5000);
		 if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("New Text Document.txt")) {
			 System.out.println("Successfull");
		 }
		 
		 
		 /*
		 //Multiple Files Upload
		 String File1="C:\\Users\\Admin\\Desktop\\Effigo Daily Reports\\Fourth Week\\Doc2.docx";
		 String File2="C:\\Users\\Admin\\Desktop\\Effigo Daily Reports\\Fourth Week\\New Text Document.txt";;
		 
		 driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(File1+"\n"+File2);
	
		 int count=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		 
		 if (count==2) {
			 System.out.println("Correct Size");
			 
		 }
		 else {
			 System.out.println("Wrong");
		 }
		 
		 
		 if(driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("New Text Document.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Doc2.docx") ){
			 System.out.println("Successfull");
		 }**/
	}
}
