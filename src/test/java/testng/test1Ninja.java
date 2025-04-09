package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class test1Ninja {

	public static void main(String []args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
			
			driver.findElement(By.name("email")).sendKeys("nausheen.shayesta86@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Password123");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			Thread.sleep(4000);
			
		   driver.findElement(By.xpath("//li[@class='dropdown']//span[@class='hidden-xs hidden-sm hidden-md']")).click();	
		   WebElement logout= driver.findElement(By.linkText("Logout"));
		   Actions action = new Actions(driver);
		   action.moveToElement(logout).build().perform();
		   logout.click();  
		
		
		
	}
	
	
	
	
	
	
}
