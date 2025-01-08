import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationMethodsPractice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		/*navigation commands  
		 * navigate().to()
		 * navigate().back()
		 * navigate().forward()
		 * navigate().refresh()
		 * 
	     */
		
		//navigate().to()-this command accepts the URL in string format and also as an object format
		WebDriver driver=new ChromeDriver();
		//string format
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
        
        
        //object format
       // URL thisurl= new URL("https://petstore.octoperf.com/actions/Catalog.action");
      // driver.navigate().to(thisurl);
        
        
        //navigate().back()
    
        driver.manage().window().maximize();
    	WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
        fish.click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("FI-SW-01")).click();
        driver.navigate().back();
        
        //navigate()forward();
        
        driver.navigate().forward();
        
        //navigate().refresh()
        
        driver.navigate().refresh();
	}

}
