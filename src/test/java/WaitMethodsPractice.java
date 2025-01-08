import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitMethodsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		/*There are 2 wait methods provided by Selenium 1)implicit wait 2)explicit wait
		 *
		 * 1)implicit wait: 
		 * advantage: it is one single statement,it is easy to use, it is applicable for all elements,it will not wait for maximum timeout if element is available, 
		 * disadvantage: it will give exception if the time is not sufficient
		 * 
		 * 
		 * Thread.sleep is also a wait method provided by Java
		 * advantage: is easy to use
		 * disadvantage: it will take maximum timeout, it will not move to next element, it it will give an exception if time is not enough
		 * 
		 * 2)Explicitly wait:
		 * advantage: 
		 * It is condition based so it works more effectively
		 * finding the element is inclusive
		 * it will wait for the condition to be true,then consider the time
		 * disadvantage: we need to write multiple statements for multiple elements
		 * 
		 */
		//1)implicit wait:
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().window().maximize();
    	WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
        fish.click();
        Thread.sleep(3000);
        
        //2)explicit wait: it has two parts 1-declaration, 2-use 
        //This is the declaration part
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        //This is the use
        WebElement fishtype =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("FI-SW-01")));
        fishtype.click();
       
        
        

	}

}
