package javascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorPractice {

	public static void main(String[] args) {
		
		/*when we use: WebDriver driver = new ChromeDriver();
		 * we have to upcast  like this: JavascriptExecutor js =(JavascriptExecutor)driver;
		 * 
		 * when we use:  ChromeDriver driver = new ChromeDriver();
		 * we do not have to cast and use directly: JavascriptExecutor js =driver;
		 * 
		 * 1)without using sendkeys methods passing value to input box, this is an alternate of sendKeys method
		 * used only when we get ElementInterceptedException
		 * 
		 * 2)clicking on element-alternate of click()
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1)without using send keys methods passing value to input box
		
		WebElement name =driver.findElement(By.cssSelector("input#name"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','John')",name);
		
		
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		js.executeScript("arguments[0].setAttribute('value','nausheenshayesta21@gmail.com')",email);
		
		WebElement phone =driver.findElement(By.cssSelector("input#phone"));
		js.executeScript("arguments[0].setAttribute('value','788763553623')", phone);
		
		//2)clicking on element-alternate of click()
		WebElement gender =driver.findElement(By.cssSelector("input#female"));
		js.executeScript("arguments[0].click()",gender);
		
		
		
		
	}

}
