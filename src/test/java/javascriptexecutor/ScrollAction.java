package javascriptexecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollAction {

	public static void main(String[] args) {
		
		/*scrolling pages using javascript
		 * 
		 * 1)scroll by pixel number
		 * 
		 * 2)scrolling till element visibility
		 * 
		 * 
		 * 3)scroll page till end 
		 * 
		 * 4)scroll to initial position
		 * 
		 * 5)horizontal scroll
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//1)scroll by pixel number
		
		js.executeScript("window.scrollBy(0,3000)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//2)scrolling till element visibility
		
		
		WebElement el =driver.findElement(By.xpath("//h2[contains(text(),'Upload Files')]"));
		js.executeScript("arguments[0].scrollIntoView();",el);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		//3)scroll page till end 
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		
		//4)scroll to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		
		
		/*5)horizontal scroll
		
		js.executeScript("window.scrollBy(0,1300)", "");
		System.out.println(js.executeScript("return window.pageXOffset;"));
		
		js.executeScript("window.scrollBy(0,document.body.scrollWidth)","");*/
		
		
		
		
		
		
		
		
		
		
	}

}
