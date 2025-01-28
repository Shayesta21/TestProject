package handlingtables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.opencart.com/admin/index.php");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(9000);
	driver.findElement(By.xpath("//a[@href='#collapse-5']")).click();	
	Thread.sleep(3000);
	driver.findElement(By.linkText("Customers")).click();
		

	}

}
