package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomPageUsingJS {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://testautomationpractice.blogspot.com/");
		
		//to minimize a page
		 driver.manage().window().minimize();
		 
		 //to set zoom level
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("document.body.style.zoom='50%'");
		 
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
		  js.executeScript("document.body.style.zoom='75%'");
		  
		  

	}
	

}
