package keyboardActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
        WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		
        
       Actions act = new Actions(driver);
		
      act.keyDown(Keys.CONTROL).click(button).keyUp(Keys.CONTROL).perform();
      
      Set <String> whid=driver.getWindowHandles();
       for(String wid: whid) {
    	   driver.switchTo().window(wid);
       }
		driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
		

	}

}
